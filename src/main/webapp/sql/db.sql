
create database smmm;

/*用户表*/
create table t_login(
	id int primary key auto_increment,
	login_id varchar(30),
	pwd varchar(30),
	status int 
);

/*货物表*/
create table t_commodity(
	id int primary key auto_increment,
	cname varchar(30),
	status int
);

/*进货记录表*/
create table t_record(
	id int primary key auto_increment,
	cid int, /*货物id*/
	quantity int /*进货数量*/
);








































