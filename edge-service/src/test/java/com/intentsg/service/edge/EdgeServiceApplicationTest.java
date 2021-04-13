package com.intentsg.service.edge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EdgeServiceApplication.class)
@WebAppConfiguration
public class EdgeServiceApplicationTest {

	@Autowired
	EdgeServiceApplication edgeServiceApplication;
	@Test
	public void contextLoads() {
		assertNotEquals(edgeServiceApplication, null);
	}
	@Test
	public void main() {
		edgeServiceApplication.main(new String[] {});
	}
}
