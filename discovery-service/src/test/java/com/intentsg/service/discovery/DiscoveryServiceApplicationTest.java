package com.intentsg.service.discovery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DiscoveryServiceApplication.class)
@WebAppConfiguration
public class DiscoveryServiceApplicationTest {
	
	@Autowired
	DiscoveryServiceApplication discoveryServiceApplication;
	@Test
	public void contextLoads() {
		assertNotEquals(discoveryServiceApplication, null);
	}
	@Test
	public void main() {
		discoveryServiceApplication.main(new String[] {});
	}
}
