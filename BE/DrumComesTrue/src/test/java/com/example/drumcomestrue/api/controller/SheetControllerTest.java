package com.example.drumcomestrue.api.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.drumcomestrue.ApiDocument;
import com.example.drumcomestrue.api.request.sheet.ModifyRequest;
import com.example.drumcomestrue.api.request.sheet.RemoveCheckedRequest;
import com.example.drumcomestrue.api.response.sheet.ListResponse;
import com.example.drumcomestrue.api.service.SheetService;
import com.example.drumcomestrue.db.entity.Sheet;

@WebMvcTest(UserController.class)
class SheetControllerTest extends ApiDocument {
	private static final String CONTEXT_PATH = "/api/v1";

	private static String USER_ID = "jinseo";
	private static long SHEET_PK = 1L;
	private static List<Long> SHEET_PK_LIST = new ArrayList<>();
	private static List<Sheet> SHEET_LIST = new ArrayList<>();


	private ModifyRequest modifyRequest;
	private RemoveCheckedRequest removeCheckedRequest;
	private ListResponse listResponse;

	@MockBean
	private SheetService sheetService;

	@BeforeEach
	void setUp(){
		modifyRequest = ModifyRequest.builder()
			.userId(USER_ID)
			.sheetPk(SHEET_PK)
			.build();

		removeCheckedRequest = RemoveCheckedRequest.builder()
			.sheetPkList(SHEET_PK_LIST)
			.userId(USER_ID)
			.build();

		listResponse = ListResponse.builder()
			.sheetList(SHEET_LIST)
			.build();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////악보 생성/////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	void 악보생성_성공() throws Exception{

	}

	@Test
	void 악보생성_실패() throws Exception{

	}
}