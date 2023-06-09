package com.masManagement.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masManagement.demo.apiConfiguration.ApiController;
import com.masManagement.demo.model.MasMember;
import com.masManagement.demo.service.MasMemberService;
import com.masManagement.demo.utils.UrlConstraint;

@ApiController
@RequestMapping(UrlConstraint.MasManagement.ROOT)
public class MasMemberController {
	
	
	private MasMemberService masService;
	
	@Autowired
	public MasMemberController(MasMemberService masService) {
		super();
		this.masService = masService;
	}
	
	///////////// Get search masMembers///////////
	
	//@GetMapping("/members/search")
	@GetMapping(UrlConstraint.MasManagement.GET_SEARCH)
	public ResponseEntity<List<MasMember>> searchMembers(@RequestParam("query") String query){
		List<MasMember> mLists = masService.searchMembers(query);
		
		return new ResponseEntity<List<MasMember>>(mLists, HttpStatus.OK);
	}

	///////// Get All Members here////////
	
	@GetMapping(UrlConstraint.MasManagement.GET_ALL)
	public ResponseEntity<List<MasMember>> getAllMesMember(){
		List<MasMember> memberList = masService.getAllMembers();
		return new ResponseEntity<List<MasMember>>(memberList, HttpStatus.OK);
		
	}

	///////////// Get Single Mesmember here/////////
	
	@GetMapping(UrlConstraint.MasManagement.GET)
	public ResponseEntity<MasMember> getSingleMember(@PathVariable("id") long id){
		MasMember member = masService.getById(id); 
		
		return new ResponseEntity<MasMember>(member, HttpStatus.OK);
	}
	
	//////// SaveController Method for masMember ///////////
	@PostMapping(UrlConstraint.MasManagement.CREATE)
	public ResponseEntity<MasMember> saveMember(@RequestBody MasMember masMember){
		MasMember masMem = masService.getSaveMembers(masMember);
		
		return new ResponseEntity<MasMember>(masMem, HttpStatus.CREATED);
	}
	
	/////////// Update MasMember Controller method here/////////
	@PutMapping(UrlConstraint.MasManagement.UPDATE)
	public ResponseEntity<MasMember> updateMember(@RequestBody MasMember masMember){
		MasMember masMem = masService.updateMember(masMember);
		
		return new ResponseEntity<MasMember>(masMem, HttpStatus.OK);
	}
	
	/////// Delete MasMember Controller here////
	@DeleteMapping("/members/{id}")
	public ResponseEntity<String> deleteMasMember(@PathVariable("id") long id){
		masService.deleteMember(id);
		return new ResponseEntity<>("MasMember id = "+id + " is Deleted", HttpStatus.OK);
		
	}
	
}
