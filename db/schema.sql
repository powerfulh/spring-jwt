CREATE TABLE IF NOT EXISTS users (
    id       BIGINT       NOT NULL AUTO_INCREMENT,
    username VARCHAR(50)  NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY uk_users_username (username)
);
