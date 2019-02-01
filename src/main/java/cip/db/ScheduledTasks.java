package cip.db;

import cip.db.repo.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ScheduledTasks {
    Logger logger = LoggerFactory.getLogger(getClass());

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    public static final int MINUTE = 60000;
    public static final int CYCLE_TIME = 45 * MINUTE;


    @Autowired
    private ClientRepository clientRepository;

    @Scheduled(fixedRate = CYCLE_TIME)
    public void test() {
        logger.info("Saving user...");
//        clientRepository.save(new Client("cassandra client", "eugenio brito"));
//        clientRepository.save(new Client("eugenio", "cassandra"));

        long count = clientRepository.count();
        logger.info("##### Number of users: " + count);
        logger.info("##### Test Query: " + clientRepository.findByLogin("eugenio@test.com"));
    }

}
