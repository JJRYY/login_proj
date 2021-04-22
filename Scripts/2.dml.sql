desc users;

insert into users values(null, 'root', password('root'), 'root@aaa.com');
insert into users values(null, 'test', password('test'), 'test@aaa.com');

select uid, id, passwd, email from users;