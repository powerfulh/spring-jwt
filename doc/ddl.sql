create table jwt_user(
                         n int auto_increment primary key,
                         username varchar(16) unique not null,
                         password varchar(80) not null,
                         updated_date datetime DEFAULT now()
);

create table jwt_role(
                         role varchar(15) primary key,
                         name varchar(20),
                         inserted_date datetime default now()
);

create table jwt_user_role(
                              n int primary key auto_increment,
                              username varchar(16) not null,
                              role varchar(15) not null,
                              unique(username, `role`),
                              inserted_date datetime default now()
);