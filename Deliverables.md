Deliverables
Postman Collection
https://www.getpostman.com/collections/c014235a99f04d60f1b1

DataBase Schema Scripts
Hibernate: create table customer (id integer not null, name varchar(255), primary key (id))
Hibernate: create table product (id integer not null, brand varchar(255), name varchar(255), price integer not null, qty integer not null, primary key (id))
Hibernate: create table request (id integer not null, customer_id integer not null, product_id integer not null, primary key (id))
Hibernate: create sequence hibernate_sequence start with 1 increment by 1