--changeset artei:1
CREATE TABLE products (
                                 uuid UUID PRIMARY KEY,
                                 title VARCHAR(255),
                                 description TEXT,
                                 price DECIMAL,
                                 quantity INTEGER,
                                 article BIGINT,
                                 creation_date TIMESTAMP,
                                 modification_date TIMESTAMP
);
