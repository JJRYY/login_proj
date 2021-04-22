drop table if exists web_gradle_erp.users;

create table if not exists web_gradle_erp.users (
	uid int not null auto_increment,
	id varchar(12) not null unique,
	passwd char(41) not null,
	email varchar(60),
	primary key (uid)
);


-- 계정 권한 부여
grant all 
   on web_gradle_erp.* 
   to 'user_gradle_erp'@'localhost' identified by 'rootroot';

-- file 권한(backup, load) -- root만 권한 부여 가능
GRANT File 
   ON *.* 
   TO 'user_gradle_erp'@'localhost';