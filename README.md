# ALDI SÜD - AIIS Java Spring Boot Interview

### [PREQUISITES FOR MAC]

1. Install, start and open PostgreSQL
> brew install postgresql

> brew services start postgresql

> psql postgres

2. Create database

> CREATE DATABASE aldi;


3. Create user

> CREATE USER aldi_user WITH PASSWORD '12345';

4. Setting permissions for the user.

> GRANT ALL PRIVILEGES ON DATABASE "aldi" TO aldi_user;


### [TROUBLE SHOOTING]

1.Web server failed to start. Port 8080 was already in use.

> lsof -i :8080

> kill -9 <PID>

