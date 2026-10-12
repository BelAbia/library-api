package io.github.belabia.library.model;
import java.time.LocalDate;

public class Member {

	private int id;
	private String name;
	private String email;
	private LocalDate registeredAt;
	
	public Member(String name, String email) {
        this.setName(name);
        this.setEmail(email);
        this.setRegisteredAt(LocalDate.now());
    }

	public int getId() {
		return id;
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

	public LocalDate getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(LocalDate registeredAt) {
		this.registeredAt = registeredAt;
	}
}
