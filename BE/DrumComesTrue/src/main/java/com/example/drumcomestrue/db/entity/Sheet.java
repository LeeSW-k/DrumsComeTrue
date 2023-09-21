package com.example.drumcomestrue.db.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name= "sheet")
public class Sheet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sheetPk;

	@Column
	@CreationTimestamp
	private LocalDateTime sheetRegistDay;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private User user;

	private void setUser(User user){
		this.user = user;
		if(user != null){
			// chatRoom.getSaveChatRoomContentsList().add(this);
			user.getSheetList().add(this);
		}
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private SheetUrl sheetUrl;


	@Builder
	public Sheet(long sheetPk, LocalDateTime sheetRegistDay, User user) {
		this.sheetPk = sheetPk;
		this.sheetRegistDay = sheetRegistDay;
	}
}
