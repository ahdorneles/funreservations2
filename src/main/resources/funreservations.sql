drop database if exists funreservations;
create database funreservations;
use funreservations;

create table client(
client_id integer AUTO_INCREMENT,
client_name char(20),
client_pass varchar(15),
client_email varchar(50),
primary key (client_id)
);

create table facility(
facility_id integer AUTO_INCREMENT,
facility_name char(50),
facility_pass varchar(15),
facility_type char(20),
facility_address varchar(100),
facility_info varchar(1000),
facility_phone integer,
primary key (facility_id)
);

create table reservation(
client_id integer,
facility_id integer,
reservation_date datetime,
primary key (facility_id, reservation_date),
foreign key (client_id) references client(client_id),
foreign key (facility_id) references facility(facility_id)
);

insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SOCCER", "Estádio Municipal - Campo de 11", "Praça do Município 6230-338", 275774430, "Com uma área de jogo de 7140m2 de relvado sintético, capacidade para aproximadamente 1500 espectadores, balneários, departamento médico e cabine de imprensa, o Estádio Municipal oferece excelentes condições à promoção do futebol.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SOCCER", "Estádio Municipal - Campo de 7", "Praça do Município 6230-338", 275774430, "Com uma área de jogo de 7140m2 de relvado sintético, capacidade para aproximadamente 1500 espectadores, balneários, departamento médico e cabine de imprensa, o Estádio Municipal oferece excelentes condições à promoção do futebol.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SOCCER", "Estádio Municipal - Novo Campo de 11 Sintectivo", "Praça do Município 6230-338", 275774430, "Com uma área de jogo de 7140m2 de relvado sintético, capacidade para aproximadamente 1500 espectadores, balneários, departamento médico e cabine de imprensa, o Estádio Municipal oferece excelentes condições à promoção do futebol.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "TENNIS", "Pavilhão Francisco José Tavares - Campo de Ténis", "Praça do Município 6230-338", 275779030, "Inaugurado em 23 de Fevereiro de 2000 pelo então ministro-adjunto Dr. Fernando Gomes, o anteriormente designado Pavilhão Municipal do Fundão tem capacidade para acolher 1056 pessoas. Possui seis balneários e uma área total de 1500 m2 de madeira flutuante no piso 1, e um leque amplo de salas desportivas no piso 0.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "ANDEBOL", "Pavilhão Francisco José Tavares - Campo Andebol", "Praça do Município 6230-338", 275779030, "Inaugurado em 23 de Fevereiro de 2000 pelo então ministro-adjunto Dr. Fernando Gomes, o anteriormente designado Pavilhão Municipal do Fundão tem capacidade para acolher 1056 pessoas. Possui seis balneários e uma área total de 1500 m2 de madeira flutuante no piso 1, e um leque amplo de salas desportivas no piso 0.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "BASKET", "Pavilhão Francisco José Tavares - Campo de Basket", "Praça do Município 6230-338", 275779030, "Inaugurado em 23 de Fevereiro de 2000 pelo então ministro-adjunto Dr. Fernando Gomes, o anteriormente designado Pavilhão Municipal do Fundão tem capacidade para acolher 1056 pessoas. Possui seis balneários e uma área total de 1500 m2 de madeira flutuante no piso 1, e um leque amplo de salas desportivas no piso 0.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SOCCER", "Parque Desportivo Municipal - Futebol de 7", "Praça do Município 6230-338", 969892635, "Requalificado e com uma dinâmica renovada, o Parque Desportivo Municipal do Fundão viu a sua abertura comemorada em 21 de agosto de 2005. Entre as suas valências encontram-se um campo de futebol de 7 com relvado sintético, um campo de squash, dois courts de ténis, um mini campo de basquetebol de rua, Piscinas Municipais Descobertas e Restaurante");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SQUASH", "Parque Desportivo Municipal - Squash", "Praça do Município 6230-338", 969892635, "Requalificado e com uma dinâmica renovada, o Parque Desportivo Municipal do Fundão viu a sua abertura comemorada em 21 de agosto de 2005. Entre as suas valências encontram-se um campo de futebol de 7 com relvado sintético, um campo de squash, dois courts de ténis, um mini campo de basquetebol de rua, Piscinas Municipais Descobertas e Restaurante");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SWIMMINGPOOL", "Parque Desportivo Municipal - Piscina Descoberta", "Praça do Município 6230-338", 969892635, "Requalificado e com uma dinâmica renovada, o Parque Desportivo Municipal do Fundão viu a sua abertura comemorada em 21 de agosto de 2005. Entre as suas valências encontram-se um campo de futebol de 7 com relvado sintético, um campo de squash, dois courts de ténis, um mini campo de basquetebol de rua, Piscinas Municipais Descobertas e Restaurante ");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "TENNIS", "Parque Desportivo Municipal - Ténis - Campo 1", "Praça do Município 6230-338", 969892635, "Requalificado e com uma dinâmica renovada, o Parque Desportivo Municipal do Fundão viu a sua abertura comemorada em 21 de agosto de 2005. Entre as suas valências encontram-se um campo de futebol de 7 com relvado sintético, um campo de squash, dois courts de ténis, um mini campo de basquetebol de rua, Piscinas Municipais Descobertas e Restaurante ");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "TENNIS", "Parque Desportivo Municipal - Ténis - Campo 2", "Praça do Município 6230-338", 969892635, "Requalificado e com uma dinâmica renovada, o Parque Desportivo Municipal do Fundão viu a sua abertura comemorada em 21 de agosto de 2005. Entre as suas valências encontram-se um campo de futebol de 7 com relvado sintético, um campo de squash, dois courts de ténis, um mini campo de basquetebol de rua, Piscinas Municipais Descobertas e Restaurante ");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "BASKET", "Parque Desportivo Municipal - Street Basket", "Praça do Município 6230-338", 969892635, "Requalificado e com uma dinâmica renovada, o Parque Desportivo Municipal do Fundão viu a sua abertura comemorada em 21 de agosto de 2005. Entre as suas valências encontram-se um campo de futebol de 7 com relvado sintético, um campo de squash, dois courts de ténis, um mini campo de basquetebol de rua, Piscinas Municipais Descobertas e Restaurante ");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SWIMMINGPOOL", "Piscinas Municipais do Fundão - Natação Bebés", "Rua Parque Desportivo", 962184616, "Inauguradas a 27 de julho de 2003, pelo então primeiro-ministro Dr. José Manuel Durão Barroso, as Piscinas Municipais do Fundão constituem-se como um dos equipamentos de excelência do concelho.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SWIMMINGPOOL", "Piscinas Municipais do Fundão - Piscina Desportiva", "Rua Parque Desportivo", 969892635, "Inauguradas a 27 de julho de 2003, pelo então primeiro-ministro Dr. José Manuel Durão Barroso, as Piscinas Municipais do Fundão constituem-se como um dos equipamentos de excelência do concelho.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SWIMMINGPOOL", "Piscinas Municipais do Fundão - Hidroginástica",  "Rua Parque Desportivo", 962184616, "Inauguradas a 27 de julho de 2003, pelo então primeiro-ministro Dr. José Manuel Durão Barroso, as Piscinas Municipais do Fundão constituem-se como um dos equipamentos de excelência do concelho.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "BTT", "Centro BTT - Serra Gardunha ",  "Serra da Gardunha", 275779030, "O Centro de BTT da Serra da Gardunha é composto por 8 rotas, com 4 níveis de dificuldade, num total de 250 km, tendo 2 rotas de entrada ligadas entre si. No interior do Parque do Convento existem duas pistas de BTT, uma de aprendizagem para crianças e outra para adultos com um só sentido. A norte, situado junto ao Parque de Campismo do Fundão, tem-se acesso a 4 percursos de dificuldades moderada a muito difícil e, sensivelmente a 1,5km desta localização, acesso a outro com início e fim em Aldeia de Joanes.");
insert into facility(facility_pass, facility_type, facility_name, facility_address, facility_phone, facility_info) values ("1234", "SWIMMINGPOOL", "Piscinas Municipais do Fundão - Hidroginástica",  "Rua Parque Desportivo", 962184616, "Inauguradas a 27 de julho de 2003, pelo então primeiro-ministro Dr. José Manuel Durão Barroso, as Piscinas Municipais do Fundão constituem-se como um dos equipamentos de excelência do concelho.");

insert into client(client_name, client_pass, client_email) values ("Adriana","1234", "ahdorneles@gmail.com");
insert into client(client_name, client_pass, client_email) values ("Andre", "1234", "andre.fco33@gmail.com");
insert into client(client_name, client_pass, client_email) values ("Armando", "1234", "armando.parreira.bartolo@gmail.com");
insert into client(client_name, client_pass, client_email) values ("Tiago","1234","tiagotduarte@sapo.pt");


insert into reservation(client_id, facility_id, reservation_date) values (1,1,"2017-02-01 18:00:00");
insert into reservation(client_id, facility_id, reservation_date) values (2,2,"2017-04-01 17:00:00");
insert into reservation(client_id, facility_id, reservation_date) values (3,3,"2017-02-05 13:00:00");
insert into reservation(client_id, facility_id, reservation_date) values (4,4,"2017-05-08 09:00:00");
