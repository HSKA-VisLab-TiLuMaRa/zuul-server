package de.hska.iwi.vslab.zuulserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableZuulProxy
public class ZuulServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
