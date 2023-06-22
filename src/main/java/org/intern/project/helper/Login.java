package org.intern.project.helper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Login {
	String email;
	String password;
}
