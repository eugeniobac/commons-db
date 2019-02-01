package cip.db.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
@ConditionalOnProperty(name = "cip.db.source", havingValue = "mongo")
@EnableAutoConfiguration(exclude = {CassandraDataAutoConfiguration.class})
public class MongoConfig extends AbstractMongoConfiguration {
    @Value("${cip.db.database}")
    private String database;

    @Value("${cip.db.host}")
    private String host;

    @Value("${cip.db.port:27017}")
    private Integer port;

    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(host, port);
    }
}
