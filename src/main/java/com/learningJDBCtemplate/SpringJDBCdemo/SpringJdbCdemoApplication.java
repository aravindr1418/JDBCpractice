package com.learningJDBCtemplate.SpringJDBCdemo;

import com.learningJDBCtemplate.SpringJDBCdemo.Repo.AlienDao;
import com.learningJDBCtemplate.SpringJDBCdemo.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learningJDBCtemplate.SpringJDBCdemo.Repo")
public class SpringJdbCdemoApplication {

	public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(SpringJdbCdemoApplication.class, args);
	Alien alien = context.getBean(Alien.class);
	alien.setId(111);
	alien.setName("Aravind");
	alien.setTech("java");


		AlienDao alienDao = context.getBean(AlienDao.class);
		alienDao.save(alien);
		System.out.println(alienDao.findAll());
	}

}
