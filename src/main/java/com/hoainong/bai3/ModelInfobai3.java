package com.hoainong.bai3;

import java.util.Arrays;

public class ModelInfobai3 {
		private String name;
		private String password;
		private boolean gender;
		private boolean married;
		private String country;
		private String[] hobbies;
		private String note;
		public ModelInfobai3() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public ModelInfobai3(String name, String password, boolean gender, boolean married, String country,
				String[] hobbies, String note) {
			super();
			this.name = name;
			this.password = password;
			this.gender = gender;
			this.married = married;
			this.country = country;
			this.hobbies = hobbies;
			this.note = note;
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isGender() {
			return gender;
		}

		public void setGender(boolean gender) {
			this.gender = gender;
		}

		public boolean isMarried() {
			return married;
		}

		public void setMarried(boolean married) {
			this.married = married;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String[] getHobbies() {
			return hobbies;
		}

		public void setHobbies(String[] hobbies) {
			
			this.hobbies = hobbies;
		}
		
		
}
