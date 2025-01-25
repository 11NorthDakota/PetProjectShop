--changeset artei:2
INSERT INTO products (uuid,title,
                      description, price,
                      quantity, article,
                      creation_date, modification_date)
VALUES  (uuid_generate_v4(),'Wireless Mouse', 'A high-quality wireless mouse with ergonomic design.', 25.99, 50, 10000001, '2025-01-01 12:00:00', '2025-01-05 15:30:00'),
        (uuid_generate_v4(),'Mechanical Keyboard', 'RGB backlit mechanical keyboard with tactile switches.', 89.99, 30, 10000002, '2025-01-02 10:00:00', '2025-01-06 16:00:00'),
        (uuid_generate_v4(),'Gaming Headset', 'Noise-canceling gaming headset with surround sound.', 59.99, 20, 10000003, '2025-01-03 14:00:00', '2025-01-07 18:00:00'),
        (uuid_generate_v4(),'4K Monitor', 'Ultra HD 27-inch monitor with HDR support.', 299.99, 10, 10000004, '2025-01-04 11:00:00', '2025-01-08 13:00:00'),
        (uuid_generate_v4(),'USB-C Hub', 'Multi-port USB-C hub with HDMI and Ethernet support.', 45.99, 40, 10000005, '2025-01-05 09:00:00', '2025-01-09 14:00:00'),
        (uuid_generate_v4(),'External Hard Drive', 'Portable 1TB external hard drive with USB 3.0 connectivity.', 79.99, 25, 10000006, '2025-01-06 10:00:00', '2025-01-10 12:00:00'),
        (uuid_generate_v4(),'Bluetooth Speaker', 'Compact Bluetooth speaker with 12-hour battery life.', 49.99, 35, 10000007, '2025-01-07 11:00:00', '2025-01-11 13:00:00'),
        (uuid_generate_v4(),'Smartphone Stand', 'Adjustable aluminum stand for smartphones and tablets.', 19.99, 60, 10000008, '2025-01-08 12:00:00', '2025-01-12 14:00:00'),
        (uuid_generate_v4(),'Wireless Charger', 'Fast wireless charging pad compatible with Qi-enabled devices.', 29.99, 45, 10000009, '2025-01-09 13:00:00', '2025-01-13 15:00:00'),
        (uuid_generate_v4(),'Laptop Cooling Pad', 'Ergonomic cooling pad with dual fans for laptops up to 17 inches.', 34.99, 20, 10000010, '2025-01-10 14:00:00', '2025-01-14 16:00:00');
