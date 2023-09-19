drop view a;
drop view b;
drop table Booking_detail;
drop table Cottage_booking; 
drop table Customers;
drop table Cottage;
drop table Activities;

 
--creating tables
create table Customers(
Customer_id serial primary key,
First_name varchar(20),
Second_name varchar(20),
Email_address varchar(40)
);

create table Cottage(
Cottage_id int primary key,
Cottage_name varchar(40)
);

create table Cottage_booking(
Cottage_booking_id serial primary key,
Cottage_booking_date date,
Customer_id serial,
Cottage_id int,
FOREIGN KEY (Customer_id) references Customers(Customer_id),
FOREIGN KEY (Cottage_id) references Cottage(Cottage_id)
);

create table Activities(
Activity_id int primary key,
Activity_name varchar(30)
);

create table Booking_detail(
Booking_id serial primary key,
Booking_date date,
Customer_id serial,
Activity_id int, 
foreign key (Activity_id) references Activities(Activity_id),
foreign key (Customer_id) references Customers(Customer_id)
);

--filling tables
insert into Customers (First_name, Second_name, Email_address)
values('Jeff', 'Bridges', 'jeffbridges@google.com'),
	  ('Sam', 'Smith', 'samssmith@google.com'),
	  ('Alice', 'Cooper', 'alicecooper@google.com'),
	  ('Karl', 'Marx', 'karlmarx@google.com'),
	  ('Matt', 'Hardy', 'matthardy@google.com');
	 
insert into Cottage (Cottage_id, Cottage_name)
values(1, 'Red Cottage'),
      (2, 'Blue Cottage'),
      (3, 'Yellow Cottage'),
      (4, 'Green Cottage');
 
insert into Cottage_booking (Cottage_booking_date, Customer_id, Cottage_id)
values ('2010-03-09', 1, 1),
	   ('2010-03-10', 2, 3),
	   ('2010-03-11', 3, 2),
	   ('2010-03-12', 4, 4),
	   ('2010-04-12', 5, 4);
	   
	  
insert into Activities (Activity_id, Activity_name)
values (1, 'Climbing'),
       (2, 'Rowing'),
       (3, 'Swimming'),
       (4, 'Forest Walk');
      
insert into Booking_detail (Booking_date, Customer_id, Activity_id)
values ('2010-03-09', 1, 1),
       ('2010-03-10', 2, 2),
       ('2010-03-11', 3, 3),
       ('2010-03-12', 4, 4),
       ('2010-03-11', 3, 4);

--select first and second name as well as cottage name      
select First_name, Second_name, Cottage_name
from Customers
join Cottage_booking  using (customer_id)
join Cottage using (Cottage_id);      

--select all customers who have not booked any activities
select Customer_id, First_name, Second_name from customers
left join Booking_detail using (Customer_id)
where Booking_date is null;

--Sets
create view a as select Customer_id from Booking_detail where activity_id = 3;
create view b as select Customer_id from Booking_detail where activity_id = 4;

--Customers who booked Swimming and forest walk
select * from a 
intersect 
select * from b;

--Customers who booked Swimming or forest walk
select * from a 
union
select * from b;

--Customers who booked forest walk but not Swimming
select * from b 
except
select * from a;


--Counting number of bookings for each cottage
select Cottage_name, count(*) as num_bookings
from Cottage_booking
join Cottage using (cottage_id)
group by Cottage_name;
	
--Counting number of bookings for each activity
select Activity_name, count(*) as num_bookings
from Booking_detail
join Activities using (activity_id)
group by Activity_name;

--Customers who have booked the red cottage
select First_name, Second_name
from Customers
where Customer_id in (
    select Customer_id
    from Cottage_booking
    where Cottage_id = 1
);
 
--Insert a new  activity booking for the customer with ID 1
begin transaction;
 
insert into Booking_detail (Booking_date, Customer_id, Activity_id)
values ('2010-03-12', 1, 2);

commit; 
select * from Booking_detail;

--Insert a new cottage booking for the customer with ID 3
begin transaction;
 
insert into Cottage_booking (cottage_booking_date, Customer_id, Cottage_id)
values ('2011-01-09', 1, 2);

commit; 
select * from Cottage_booking;
