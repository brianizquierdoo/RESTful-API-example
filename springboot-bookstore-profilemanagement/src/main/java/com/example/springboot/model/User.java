package com.example.springboot.model;

//import java.util.ArrayList;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users", schema = "public")
public class User {

		@Id
		private String username;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "admin")
		private boolean admin;
		
//		@OneToMany(cascade = CascadeType.ALL)
//		@JoinColumn(name = "username", referencedColumnName = "username")
//		List<CreditCards> creditcards = new ArrayList<>();
//		
//		
//		public List<CreditCards> getCreditcards() {
//			return creditcards;
//		}
//		public void setCreditcards(List<CreditCards> creditcards) {
//			this.creditcards = creditcards;
//		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public boolean isAdmin() {
			return admin;
		}
		public void setAdmin(boolean admin) {
			this.admin = admin;
		}	
	
}
