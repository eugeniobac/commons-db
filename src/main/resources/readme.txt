docker run --name cassandra -p 127.0.0.1:9042:9042 -p 127.0.0.1:9160:9160   -d cassandra

docker inspect cassandra | grep IPAddress
docker exec -it cassandra cqlsh 172.17.0.2

create keyspace testnamespace with replication = {'class':'SimpleStrategy','replication_factor':1};

CREATE TABLE testnamespace.client(
    login text PRIMARY KEY,
    name text
);