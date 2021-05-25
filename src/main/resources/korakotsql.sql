drop database if exists car_db;

create database car_db;
USE car_db;

create table make(
	make_id INT primary key AUTO_INCREMENT,
	make_name VARCHAR(50) unique not null,
	country_origin VARCHAR(50) not null
);

create table model(
	model_id INT primary key AUTO_INCREMENT,
	model_name VARCHAR(50) not null,
	model_year INT not null,
	model_price DOUBLE not null,
	make INT, 
	constraint make_model_fk foreign key (make) references make(make_id)
	);

	
insert into make(make_name, country_origin)
values 
('Mercedes','Germany'),
('BMW', 'Germany'),
('Mini','Germany'),
('Tesla', 'United States'),
('Honda','Japan'),
('Toyota','Japan'),
('Kia','Korea'),
('Jeep','United States'),
('Audi','Germany'),
('Porsche','Germany'),
('Lambo', 'Italy');
commit;

insert into model(model_name,model_year,model_price,make)
value
('S550',2020,104000.00,1),
('Model S',2020,80000.00,4),
('Model 3',2020,35000.00,4),
('Model X',2020,90000.00,4),
('Model Y',2020,50000.00,4),
('I8',2020,147500.00,2),
('911',2020,97000.00,10),
('Cooper S',2020,30000.00,3),
('Civic',2020,23000.00,5),
('Veneno Roadster',2020,8300000.00,11);
commit;