# Project Raptor
A project and timesheet manager developed using Java 11, Spring Boot, Maven, PostgreSQL, Docker.

-----



Creating a Docker postgreSQL container:
```
docker run -d --name dev-postgres -e POSTGRES_PASSWORD=mysecretpassword -v ${HOME}/postgres-data/:/var/lib/postgresql/data -p 5432:5432 postgres
```

Creating postgreSQL user and database:
```
CREATE DATABASE projectraptor;
CREATE ROLE backend WITH LOGIN ENCRYPTED PASSWORD 'mysecretpassword';
ALTER USER role_specification WITH CREATEDB CREATEROLE;
GRANT ALL PRIVILEGES ON DATABASE projectraptor TO backend;
```