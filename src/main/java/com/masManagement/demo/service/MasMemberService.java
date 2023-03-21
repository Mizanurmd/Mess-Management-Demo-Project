package com.masManagement.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masManagement.demo.model.MasMember;
import com.masManagement.demo.repository.MasMemberRepository;

@Service
public class MasMemberService {
	
	
	private MasMemberRepository mRepository;
	

	@Autowired
	public MasMemberService(MasMemberRepository mRepository) {
		super();
		this.mRepository = mRepository;
	}
	
	//////////// for search masmembers//////////////
	
	public List<MasMember> searchMembers(String query){
		List< MasMember>memList = mRepository.searchMembers(query);
		
		return memList;
		
	}
	/////// Get All MesMembers Here//////////
	public List<MasMember> getAllMembers() {
		
		return mRepository.findAll();
	}

	///////// Get Single MesMember here////////
	public MasMember getById(long id) {
		
		return mRepository.findById(id).get();
	}

	//// Save masMember service method///////
	public MasMember getSaveMembers(MasMember masMember) {
		// TODO Auto-generated method stub
		return mRepository.save(masMember);
	}

	//////////// Update masMember service here////////////
	public MasMember updateMember(MasMember masMember) {
		Long id = masMember.getId();
		MasMember m = mRepository.findById(id).get();
		
		m.setFname(masMember.getFname());
		m.setLname(masMember.getLname());
		m.setFatherName(masMember.getFatherName());
		m.setMotherName(masMember.getMotherName());
		m.setAddress(masMember.getAddress());
		m.setRoomNo(masMember.getRoomNo());
		m.setJoinDate(masMember.getJoinDate());
		m.setNidNo(masMember.getNidNo());
		m.setMoblie(masMember.getMoblie());
		m.setEmail(masMember.getEmail());
		m.setAbout(masMember.getAbout());
		m.setImgeUrl(masMember.getImgeUrl());
		
		return mRepository.save(m);
	}

	/////////// Delete service here//////
	
	public void deleteMember(long id) {
		mRepository.deleteById(id);
		
	}

}
