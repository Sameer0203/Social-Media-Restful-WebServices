insert into user_details(id, birthdate, name)
values(10001, current_date(), 'Sam');

insert into user_details(id, birthdate, name)
values(10002, current_date(), 'David');

insert into user_details(id, birthdate, name)
values(10003, current_date(), 'Tim');

insert into post(id, description, user_id)
values(20001, 'I want to learn Microservices', 10001);

insert into post(id, description, user_id)
values(20002, 'I want to learn Rest API', 10001);

insert into post(id, description, user_id)
values(20003, 'I want to learn DSA in JAVA', 10002);

insert into post(id, description, user_id)
values(20004, 'I want to learn Computer Fundamentals', 10002);