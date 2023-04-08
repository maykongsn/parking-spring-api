CREATE TABLE CAR_SPOT (
    car_id VARCHAR,
    parking_spot_id VARCHAR,

    CONSTRAINT car_spot_fkey1 FOREIGN KEY (car_id) REFERENCES CAR(id),
    CONSTRAINT car_spot_fkey2 FOREIGN KEY (parking_spot_id) REFERENCES PARKING_SPOT(id)
);