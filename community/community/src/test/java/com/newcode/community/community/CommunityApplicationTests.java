package com.newcode.community.community;

import com.newcode.community.community.dao.AlphaDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext ac;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ac=applicationContext;
	}
	@Test
	public void testApplicationContext(){
		System.out.println(ac);
		AlphaDao alphaDao=ac.getBean(AlphaDao.class);
		System.out.println(alphaDao.select());
	}
	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat=ac.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}
	@Autowired
	private AlphaDao alphaDao;

	@Test
	public void testDi(){
		System.out.println(alphaDao);
	}

}
