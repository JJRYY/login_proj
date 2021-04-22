select uid, id, passwd, email from users;

select id from users where id = 'root' and passwd = password('root'); 