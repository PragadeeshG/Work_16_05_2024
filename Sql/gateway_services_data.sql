create table if not exists gateway_services_data(
service_code varchar(255) not null,
service_name varchar(255) null,
instances varchar(255) null,
naming_server varchar(255) null,
environment varchar(255) null,
data_centre varchar(255) null,
lease_expiration varchar(255) null,
renewals Integer null,
threshold varchar(255) null,
renew_last_min varchar(255) null,
up_time varchar(255) null,
constraint gateway_services_data_pk primary key(service_code));