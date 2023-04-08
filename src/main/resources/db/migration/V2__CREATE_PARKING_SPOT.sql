CREATE TABLE PARKING_SPOT(
    id VARCHAR PRIMARY KEY,
    parking_spot VARCHAR(10) NOT NULL UNIQUE,
    registration_date DATE NOT NULL,
    responsible_name VARCHAR(130) NOT NULL,
    apartment VARCHAR(30) NOT NULL,
    block VARCHAR(30) NOT NULL
);