#Database
        :Not easy to manage 
		:insert , append update and delete is diffcult 
		 : locate the file
		 : open the file : binary , string mode
		 
        --it is managment software which manage the data in table form
        --SQL: insert , update ,create , delete 
		  #database--it is like directory and folder in os 
		  #Tables -- combination of row and col(taples)

#Database software : Command line using SQL
                    : Database client : connect to database 
					: you can write query or graphically you can use it
					:workbaneh
					:sql yog
					:dbviewer

#create a database:

>create database databasename
#create database atcs

>use the database
#use database name
>use atcs;

>create tables:

create table tablename(colname1 datatype1,
                       colname2 datatype2,
					   colname3 datatype3);
>create table employee(id int, name char(100),salary int);


#list all the table in database
 : show tables;

:Data types in MYSQl:
  : String varchar
  : Number : int 

#describe table
 desc tablename
#desc employee 

#Read the table
select query : select * from tablename;
                select col1,col2 from tablename;

#insert into
//insert data for all the col(full row)
insert into tablename values(col1,col2,col3);

//insert the data for particulr col 
inert into tablname(col1,col2) values(val1,col2);
update employee set salary=35000 where id=2;
#RED 
#update the table
update tablename set col=new value ,col2=newvalue where condition

#RED
#delete

Delete from talename where  condition
 #delete from employee where id=3;
CRUD--Create , Read, Update Delete

Relational Database : one table is connected with another 
NoSQL --  JSON--
 Comsume--JSON
 Produce--JSON
 
 {
  "id":"ravinde",
  "age":35,
  "address": { 
         "city" :"chd"
  }  
	 
 }
 
 
 

		   
        --Relational Database 
		