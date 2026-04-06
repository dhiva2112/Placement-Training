drop table if exists StudentsID1;
create database some2;
use some2;
create table StudentsID1(
rollno int primary key,
name varchar(50),
age int,
dept varchar(50),
mark int
);
show tables;
select * from StudentsID1;
insert into StudentsID1(rollno,name,age,dept,mark) values
(1,'RamKamal',21,'CSE',75),
(2,'Sathish',20,'CSE',76),
(3,'Dhiva',20,'CSE',72),
(4,'Suresh',21,'ECE',72),
(5,'Dhanush',20,'EEE',72),
(6,'Vimal',21,'ECE',72),
(7,'Kumar',20,'IT',72),
(8,'Vinoth',20,'AIML',72);
delete from StudentsID1 where rollno=2;
select * from StudentsID1;
update  StudentsID1 set dept="AIDS" WHERE RollNo=6;
SELECT * FROM StudentsID1;