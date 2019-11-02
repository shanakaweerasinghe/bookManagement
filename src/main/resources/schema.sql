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
