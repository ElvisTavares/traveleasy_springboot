INSERT INTO tb_travel_list (name) VALUES ('Internacional');
INSERT INTO tb_travel_list (name) VALUES ('Nacional');

INSERT INTO tb_travel (destiny, departure_date, return_date, means_of_transport, accommodation, budget) VALUES ('Salvador', '2023-12-31', '2024-02-15' , 'busao', 'hotel', 15000);
INSERT INTO tb_travel (destiny, departure_date, return_date, means_of_transport, accommodation, budget) VALUES ('Rio de janeiro', '2023-12-31', '2024-02-15' , 'busao', 'hotel', 18000);
INSERT INTO tb_travel (destiny, departure_date, return_date, means_of_transport, accommodation, budget) VALUES ('Australia', '2023-12-31', '2024-02-15' , 'aviao', 'hotel', 35000);
INSERT INTO tb_travel (destiny, departure_date, return_date, means_of_transport, accommodation, budget) VALUES ('Paris', '2023-12-31', '2024-02-15' , 'aviao', 'hotel', 35000);

INSERT INTO tb_belonging (list_id, travel_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (list_id, travel_id, position) VALUES (1, 2, 1);

INSERT INTO tb_belonging (list_id, travel_id, position) VALUES (2, 3, 2);
INSERT INTO tb_belonging (list_id, travel_id, position) VALUES (2, 4, 3);