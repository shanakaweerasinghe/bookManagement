https://feilerdev.wordpress.com/2017/12/05/installing-postgresql-on-windows-using-zip-archive-without-the-installer/

initdb -U postgres -A password -E utf8 -W -D C:\Users\Sampath\Downloads\pgsql\data

pg_ctl -D "C:\Users\Sampath\Downloads\pgsql\data" -l logfile start

psql -U postgres
\l

CREATE DATABASE lms_db;

\c lms_db

CREATE TABLE books (
bookId varchar(30) NOT NULL,
bookName varchar(30) NOT NULL,
author varchar(30),
edition varchar(30),
category varchar(30),
libraryId varchar(30) NOT NULL,
rackNo varchar(30) NOT NULL,
status varchar(30) NOT NULL,
issuedTo varchar(30),
dateOfissued varchar(30),
dateOfPurchase varchar(30),
price varchar(30),
description varchar(100),
PRIMARY KEY (bookId)
);

\dt+

SELECT * FROM books;



DROP TABLE books;



insert into books(bookId,bookName,author,edition,category,libraryId,rackNo,status,issuedTo,dateOfissued,dateOfPurchase,price,description) values('001','Madoldwua','martin Wickramasinghe','first','Novel','L001','L001-A1','available',null,null,'19-06-2010','300.00','description');




https://dzone.com/articles/bounty-spring-boot-and-postgresql-database
