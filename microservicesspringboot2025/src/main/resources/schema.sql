CREATE TABLE IF NOT EXISTS clients(
    id int AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(50) NOT NULL,
    last_name varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    telephone varchar(20) NOT NULL,
    created_at date NOT NULL,
    updated_at date DEFAULT NULL
);
INSERT INTO clients SET first_name='Juan', last_name='Perez', email='jperez@una.cr',telephone='8888-8888',created_at=now();
INSERT INTO clients SET first_name='John', last_name='Deer', email='jdeer@una.cr',telephone='7777-8888',created_at=now();
CREATE TABLE IF NOT EXISTS accounts(
    account_number int AUTO_INCREMENT NOT NULL,
    client_id int NOT NULL,
    account_type varchar(50) NOT NULL,
    balance double DEFAULT NULL,
    created_at date NOT NULL,
    updated_at date DEFAULT NULL
);