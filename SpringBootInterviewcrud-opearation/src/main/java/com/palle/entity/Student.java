package com.palle.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Student {
		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		public int sId;
		public String sName;
		public String eMail; 
		public String mobile;
		public int age;
		public String gender;
		public int getsId() {
			return sId;
		}
		public void setsId(int sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}		

	}


