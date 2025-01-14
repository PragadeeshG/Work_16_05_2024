create table if not exists gateway_service_structure(
service_code varchar(255) not null,
service_name varchar(255) null,
ds_replicas varchar(255) null,
system_status varchar(255) null,
registry varchar(255) null,
arc_type varchar(255) null,
cpu_avail char null,
cpu_count Integer null,
current_usage varchar(255) null,
registered_replica varchar(255) null,
available_replica varchar(255) null,
unavailable_replica varchar(255) null,
ip_address varchar(255) null,
status varchar(255) null,
constraint gateway_service_structure_pk primary key(service_code));