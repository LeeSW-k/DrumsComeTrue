package com.example.drumcomestrue.api.response.sheet;

import java.util.List;

import com.example.drumcomestrue.db.entity.Sheet;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ListResponse {
	private List<Sheet> sheetList;
}
