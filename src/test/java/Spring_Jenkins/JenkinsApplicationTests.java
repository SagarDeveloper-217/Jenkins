package Spring_Jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsApplicationTests {
	
	public static Logger Logger=LoggerFactory.getLogger(JenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		Logger.info("Test Case executing ...");
//		Logger.info("Jekins Working Good ...");
		assertEquals(true, true);
	}

}
