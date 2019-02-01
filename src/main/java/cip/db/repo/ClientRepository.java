package cip.db.repo;

import cip.db.DocumentRepository;
import cip.db.entities.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends DocumentRepository<Client, String> {
     Client findByLogin(String login);
}
