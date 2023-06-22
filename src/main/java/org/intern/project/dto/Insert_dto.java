package org.intern.project.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
@Component
public class Insert_dto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String packages;
	private double cost;
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private byte[] picture;
}
