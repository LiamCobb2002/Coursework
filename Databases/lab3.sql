--drop table clothh, compp;
create table compp (
	producer_id varchar(20) primary key,
	
	prodname varchar(80) not null,
	phone varchar(20) not null,
	email varchar(80));

create table clothh (
	producer_id varchar(20) references compp(producer_id),
	product_id serial primary key,
    cdesc varchar(80) not null,
    csize varchar(10) not null,
    quant int default 0);
    
insert into compp(producer_id, prodname, phone, email) values ('Tyrwhitt', 'Charles Tyrwhitt Shirts', '0044 12345678', 'Charles@Tyrwhitt.co.uk');
insert into compp(producer_id, prodname, phone, email) values ('Shelby', 'Charles Tyrwhitt Shirts', '0044 32345678', 'John@shelby.co.uk');
insert into compp(producer_id, prodname, phone, email) values ('Aran', 'Aran Woollen Mills', '0035 3414442', 'maire@aran.ie');

   
insert into clothh(producer_id, cdesc, csize, quant) values ('Tyrwhitt', 'Tan cotton shirt', 'M', '5');
insert into clothh(producer_id, cdesc, csize, quant) values ('Tyrwhitt', 'Tan cotton shirt', 'L', '5');
insert into clothh(producer_id, cdesc, csize, quant) values ('Shelby', 'Gray tweed suit', 'L', '5');
insert into clothh(producer_id, cdesc, csize, quant) values ('Aran', 'Oatmeal sweater', 'XL', '5');


--select * from cloth join comp using (producer_id);

select 'CDescription: ' ||cdesc|| ', Size: ' ||Csize|| ', Cquantity: ' ||quant|| ', Producer ID@ ' ||producer_id|| ', Producer name: ' ||prodname|| ', Producer phone: ' ||phone|| ', Email: ' ||email|| '.' from clothh
join compp using(producer_id);