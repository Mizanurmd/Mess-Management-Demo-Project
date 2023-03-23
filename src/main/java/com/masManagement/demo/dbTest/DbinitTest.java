package com.masManagement.demo.dbTest;

import org.springframework.context.annotation.Configuration;

import com.masManagement.demo.model.MasMember;
import com.masManagement.demo.repository.MasMemberRepository;

import jakarta.annotation.PostConstruct;

@Configuration
public class DbinitTest {
	
	private final MasMemberRepository masMemberRepository;
	
	public DbinitTest(MasMemberRepository masMemberRepository) {
		this.masMemberRepository = masMemberRepository;
	}
	
	//@PostConstruct
	void initTestDB() {
		MasMember m = new MasMember();
		m.setFname("Mizanur");
		m.setLname("Rahman");
		m.setFatherName("Md.Moslam Sarder");
		m.setMotherName("Sufia Khatun");
		m.setAddress("Adabor-10, Dhaka-1207");
		m.setRoomNo("01");
		m.setJoinDate("12-05-2023");
		m.setNidNo("0885582110");
		m.setMoblie("016082364244");
		m.setEmail("sizan11@gmail.com");
		m.setAbout("Java developer");
		m.setImgeUrl("default");
		
		 m = masMemberRepository.save(m);
		 System.out.println("Member id : " + m.getId());
		 System.out.println("Member id : " + m.getFname());
		
	}

}
