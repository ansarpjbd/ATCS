Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 14
Server version: 8.0.25 MySQL Community Server - GPL

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create database atcs
    -> ;
Query OK, 1 row affected (0.02 sec)

mysql> use atcs;
Database changed
mysql> create table employee(id int, name char(100),salary int);
Query OK, 0 rows affected (0.39 sec)

mysql> show tables;
+----------------+
| Tables_in_atcs |
+----------------+
| employee       |
+----------------+
1 row in set (0.00 sec)

mysql> desc employee;
+--------+-----------+------+-----+---------+-------+
| Field  | Type      | Null | Key | Default | Extra |
+--------+-----------+------+-----+---------+-------+
| id     | int       | YES  |     | NULL    |       |
| name   | char(100) | YES  |     | NULL    |       |
| salary | int       | YES  |     | NULL    |       |
+--------+-----------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> select * from employee;
Empty set (0.26 sec)

mysql> insert into employee values(1,'Ravinder',25000);
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | Ravinder |  25000 |
+------+----------+--------+
1 row in set (0.00 sec)

mysql> insert into employee values(1,'Kumar',10000);
Query OK, 1 row affected (0.00 sec)

mysql> insert into employee values(1,'Pankaj',20000);
Query OK, 1 row affected (0.26 sec)

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | Ravinder |  25000 |
|    1 | Kumar    |  10000 |
|    1 | Pankaj   |  20000 |
+------+----------+--------+
3 rows in set (0.00 sec)

mysql> update table employee set salary=20000 where id=1;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table employee set salary=20000 where id=1' at line 1
mysql> update employee set salary=20000 where id=1;
Query OK, 2 rows affected (0.01 sec)
Rows matched: 3  Changed: 2  Warnings: 0

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | Ravinder |  20000 |
|    1 | Kumar    |  20000 |
|    1 | Pankaj   |  20000 |
+------+----------+--------+
3 rows in set (0.00 sec)

mysql> update table employee set id=2 where name='Kumar' ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'table employee set id=2 where name='Kumar'' at line 1
mysql> update employee set id=2 where name='Kumar' ;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set id=3 where name='Pankaj' ;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | Ravinder |  20000 |
|    2 | Kumar    |  20000 |
|    3 | Pankaj   |  20000 |
+------+----------+--------+
3 rows in set (0.00 sec)

mysql> update employee set salary=25000 where id=1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update employee set salary=35000 where id=2;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | Ravinder |  25000 |
|    2 | Kumar    |  35000 |
|    3 | Pankaj   |  20000 |
+------+----------+--------+
3 rows in set (0.00 sec)

mysql> delete from employee where id=3;
Query OK, 1 row affected (0.01 sec)

mysql> select * from employee;
+------+----------+--------+
| id   | name     | salary |
+------+----------+--------+
|    1 | Ravinder |  25000 |
|    2 | Kumar    |  35000 |
+------+----------+--------+
2 rows in set (0.01 sec)

mysql>

