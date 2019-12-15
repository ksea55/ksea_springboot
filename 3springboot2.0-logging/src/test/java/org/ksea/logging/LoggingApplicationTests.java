package org.ksea.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoggingApplicationTests {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void contextLoads() {

        logger.trace("这是日志中的最低等级..........trace");
        logger.debug("这是日志中的debug等级.........debug");
        logger.info("这是日志中的info等级的..........info");
        logger.warn("这是日志中的warn等级的..........warn");
        logger.error("这是日志中的error等级的........error");
    }

}
