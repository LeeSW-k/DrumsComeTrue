package com.example.drumcomestrue.db.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.NoArgsConstructor;

/** 악보 주소 */
@Entity
@Table(name = "sheet_url")
@NoArgsConstructor
public class SheetUrl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sheetPk;

	@Column
	private String sheetUrl;

	@OneToOne(mappedBy = "sheetUrl", cascade = CascadeType.ALL)
	private Sheet sheet;

	@Builder
	public SheetUrl(long sheetPk, String sheetUrl) {
		this.sheetPk = sheetPk;
		this.sheetUrl = sheetUrl;
	}
}

