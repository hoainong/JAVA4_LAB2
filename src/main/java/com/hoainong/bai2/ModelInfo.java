package com.hoainong.bai2;

public class ModelInfo {
		private String name;
		private String password;
		private boolean gender;
		private boolean married;
		private String country;
		private String note;
		public ModelInfo() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ModelInfo(String name, String password, boolean gender, boolean married, String country, String note) {
			super();
			this.name = name;
			this.password = password;
			this.gender = gender;
			this.married = married;
			this.country = country;
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
		
		
}
