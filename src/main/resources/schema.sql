create schema happyhouse AUTHORIZATION DBA;
set schema happyhouse;
 
drop table tbl_user if exists;
 
CREATE TABLE tbl_user (
  id varchar(40) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(45) NOT NULL
);

/*
drop table article if exists;

create table article (
  id int  auto_increment,
  author varchar(50),
  title varchar(200),
  content varchar(4000),
  PRIMARY KEY (id)
)
*/