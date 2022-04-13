package infrastructure.performance.protoproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@ApplicationScoped
public class ProtoProjectServiceBean implements ProtoProjectService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProtoProjectServiceBean.class);

    public Map<String,String> protoProcessing (int upperbound) {
        Random random = new Random();
        Map<String,String> map = new HashMap<>();
        int randomInt = random.nextInt(upperbound);
        LOGGER.info("[ProtoProjectServiceBean.protoProcessing] number: "+ randomInt);
        if (randomInt%2 == 0) {
            map.put("randomNumber","Genap");
        } else {
            map.put("randomNumber","Ganjil");
        }
        return map;
    }
}
