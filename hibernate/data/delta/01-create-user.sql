DROP USER 'CSUSER'@'localhost';

CREATE USER 'CSUSER'@'localhost' IDENTIFIED BY 'cloud';

GRANT ALL PRIVILEGES ON hwng_db . * TO 'CSUSER'@'localhost';

GRANT ALL PRIVILEGES ON HW . * TO 'CSUSER'@'localhost';

FLUSH PRIVILEGES;