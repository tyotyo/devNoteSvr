package com.hw.DevNote.model;

public class MemberVO {
	String memID;
	String email;
	String memName;
	String phoneNum;
	String nickname;
	
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memID=" + memID + ", email=" + email + ", memName=" + memName + ", phoneNum=" + phoneNum
				+ ", nickname=" + nickname + "]";
	}
	
}
