create table users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_name varchar_ignorecase(50) not null,
    password varchar_ignorecase(50) not null,
    roles varchar_ignorecase(50) not null,
    active boolean not null
);

