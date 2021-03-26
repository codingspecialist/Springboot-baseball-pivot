package com.cos.baseball.domain;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Team { // 1, 롯데, 2021.03.26, 부산구장
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@JoinColumn(name = "stadiumId")
	@OneToOne(cascade = CascadeType.DETACH)
	private Stadium stadium;
	
	@Transient // DB에 칼럼을 만들지 않느다.
	private int stadiumId;
	
	@CreationTimestamp
	private Timestamp createDate;
}





