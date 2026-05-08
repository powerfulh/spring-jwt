create table jwt_user(
                         n int auto_increment primary key,
                         username varchar(16) unique not null,
                         password varchar(80) not null,
                         updated_date datetime DEFAULT now()
)