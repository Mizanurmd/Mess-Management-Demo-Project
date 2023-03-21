package com.masManagement.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mas_member")
public class MasMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String fname;
	private String lname;
	private String fatherName;
	private String motherName;
	private String address;
	private String roomNo;
	private String joinDate;
	private String nidNo;
	private String moblie;
	private String email;
	private String about;
	private String imgeUrl;
	public MasMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MasMember(long id, String fname, String lname, String fatherName, String motherName, String address,
			String roomNo, String joinDate, String nidNo, String moblie, String email, String about, String imgeUrl) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.roomNo = roomNo;
		this.joinDate = joinDate;
		this.nidNo = nidNo;
		this.moblie = moblie;
		this.email = email;
		this.about = about;
		this.imgeUrl = imgeUrl;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getNidNo() {
		return nidNo;
	}
	public void setNidNo(String nidNo) {
		this.nidNo = nidNo;
	}
	public String getMoblie() {
		return moblie;
	}
	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getImgeUrl() {
		return imgeUrl;
	}
	public void setImgeUrl(String imgeUrl) {
		this.imgeUrl = imgeUrl;
	}
	@Override
	public String toString() {
		return "MasMember [id=" + id + ", fname=" + fname + ", lname=" + lname + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", address=" + address + ", roomNo=" + roomNo + ", joinDate="
				+ joinDate + ", nidNo=" + nidNo + ", moblie=" + moblie + ", email=" + email + ", about=" + about
				+ ", imgeUrl=" + imgeUrl + "]";
	}
	

}
