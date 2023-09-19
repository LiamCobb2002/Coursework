--Author: Liam Cobb
--Create 2 tables and fill them with data

create table driver2 (
    driver_id serial primary key,
    dname varchar(80) not null,
    dlname varchar(80) not null,
    email varchar(80) not null);
   
    
create table car2 (
	driver_id serial primary key,
	make varchar(30) not null,
	colour varchar not null,
	reg varchar(20) not null,
	cap integer default 5);

insert into driver2(dname, dlname, email) values ('jeff', 'bridges', 'jeff@gmail.com');
insert into driver2(dname, dlname, email) values ('sarah', 'jones', 'sarah@gmail.com');
insert into driver2(dname, dlname, email) values ('josh', 'martin', 'josh@gmail.com');
insert into driver2(dname, dlname, email) values ('matt', 'hardy', 'matt@gmail.com');

insert into car2(make, colour, reg, cap) values ('ford', 'red', '1a2b3c', 4);
insert into car2(make, colour, reg, cap) values 'hyundai', 'blue', '1a2b3c', 3);
insert into car2(make, colour, reg) values ('kia', 'green', '1a2b3c');
insert into car2(make, colour, reg, cap) values ('ford', 'black', '1a2b3c', 6);
