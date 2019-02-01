package cip.db;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface DocumentRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
//    CassandraRepository<T, ID>, MongoRepository<T, ID>
}
