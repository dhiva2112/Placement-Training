drop table if exists Simple4;
create database Simple4;
use Simple4;
create table Students(
Rollno int,
Name varchar(50),
DeptID int
);
create table Department(
DeptID int,
DeptName varchar(50)
);
insert into Students values
(1,'ARUN',101),
(2,'Bala',102),
(3,'Charan',103),
(4,'Dhiva',104);
insert into Department values
(101,'CSE'),
(104,'ECE');
select s.Rollno,s.Name,d.DeptName
from Students s
right join Department d
on s.DeptID=d.DeptID;
