insert into city (name) values ('Angered');
insert into city (name) values ('Zhoutie');
insert into city (name) values ('Izumi');
insert into city (name) values ('Huocheng');
insert into city (name) values ('Hato Mayor del Rey');

INSERT INTO ROLE (role_name) VALUES ('Manager');
INSERT INTO ROLE (role_name) VALUES ('Employee');

insert into name (first_name, last_name, email, street_address, city_id, zip) values ('Ugo', 'Scyner', 'uscyner0@unicef.org', '46 Rieder Place', 3, 11658);
insert into name (first_name, last_name, email, street_address, city_id, zip) values ('Sonni', 'Allans', 'sallans1@mozilla.com', '4 Delladonna Road', 5, 12472);
insert into name (first_name, last_name, email, street_address, city_id, zip) values ('Hamish', 'Manneville', 'hmanneville2@comcast.net', '9 Kipling Parkway', 2, 12370);
insert into name (first_name, last_name, email, street_address, city_id, zip) values ('Henrik', 'Giacopelo', 'hgiacopelo3@webmd.com', '42 Magdeline Circle', 4, 12336);
insert into name (first_name, last_name, email, street_address, city_id, zip) values ('Lori', 'Stiffkins', 'lstiffkins4@geocities.jp', '415 Schiller Drive', 2, 11449);

INSERT INTO name_roles (name_id, roles_id) VALUES (1,2); 
INSERT INTO name_roles (name_id, roles_id) VALUES (2,2);
INSERT INTO name_roles (name_id, roles_id) VALUES (3,2);
INSERT INTO name_roles (name_id, roles_id) VALUES (4,2);
INSERT INTO name_roles (name_id, roles_id) VALUES (5,2);
INSERT INTO name_roles (name_id, roles_id) VALUES (1,1);
INSERT INTO name_roles (name_id, roles_id) VALUES (3,1);