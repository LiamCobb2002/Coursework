--Author: Liam Cobb

drop table company,employee,training;
CREATE TABLE company (
    department_name VARCHAR(40) NOT NULL,
    location        VARCHAR
--  ERROR: VARCHAR2 size not specified
     NOT NULL
);

ALTER TABLE company ADD CONSTRAINT company_pk PRIMARY KEY ( department_name );

CREATE TABLE employee (
    name       VARCHAR(20) NOT NULL,
    staff_id   SERIAL
--  ERROR: VARCHAR2 size not specified
     NOT NULL,
    work_start DATE NOT NULL
);

ALTER TABLE employee ADD CONSTRAINT employee_pk PRIMARY KEY ( name );

CREATE TABLE training (
    company_department_name VARCHAR(40) NOT NULL,
    employee_name       VARCHAR
--  ERROR: VARCHAR2 size not specified
     NOT NULL,
    t_week                  DATE
);

ALTER TABLE training ADD CONSTRAINT training_pk PRIMARY KEY ( company_department_name,
                                                              employee_name );

ALTER TABLE training
    ADD CONSTRAINT training_company_fk FOREIGN KEY ( company_department_name )
        REFERENCES company ( department_name );

ALTER TABLE training
    ADD CONSTRAINT training_employee_fk FOREIGN KEY ( employee_name )
        REFERENCES employee ( name );
        
 insert into company(Department_name, location) values ('household', 'second floor');
 insert into company(Department_name, location) values ('gifts', '14th floor');

insert into employee(name, work_start) values ('emily', '1/3/2022');
insert into employee(name, work_start) values ('james', '2/3/2022');

insert into  training(employee_name, company_department_name, t_week) values ('emily', 'household', '2/3/2022');
insert into  training(employee_name, company_department_name, t_week) values ('james','household', '3/3/2022');

select * from training
