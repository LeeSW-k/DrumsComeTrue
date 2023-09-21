package com.example.drumcomestrue.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.drumcomestrue.api.request.sheet.ModifyRequest;
import com.example.drumcomestrue.api.request.sheet.RemoveCheckedRequest;
import com.example.drumcomestrue.api.response.sheet.ListResponse;
import com.example.drumcomestrue.api.service.SheetService;
import com.example.drumcomestrue.db.entity.Sheet;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sheet")
@RequiredArgsConstructor
public class SheetController {

	private final SheetService sheetService;

	/** 유저의 악보 조회 */
	@GetMapping("/list/{userId}")
	public ResponseEntity<ListResponse> list(@PathVariable("userId") String userId) {
		ListResponse result = ListResponse.builder()
			.sheetList(sheetService.findSheets(userId)).build();
		return new ResponseEntity<ListResponse>(result, HttpStatus.OK);
	}

	/** 유저의 악보 만들기
	 * @param file*/
	@PostMapping("/create/{userId}")
	public ResponseEntity<String> create(@RequestParam("file") MultipartFile file, @PathVariable("userId")String userId) {
		return new ResponseEntity<>("악보 제작 성공", HttpStatus.OK);
	}

	/** 유저의 악보 한 개 삭제하기 */
	@DeleteMapping("/remove/{userId}/{sheetPk}")
	public ResponseEntity<String> remove(@PathVariable("userId") String userId,
		@PathVariable("sheetPk") String sheetPk) {
		return new ResponseEntity<>("악보 삭제 성공", HttpStatus.OK);
	}

	/** 유저가 선택한 악보 여러개 삭제하기 */
	@PostMapping("/remove")
	public ResponseEntity<String> removeChecked(@RequestBody RemoveCheckedRequest removeCheckedRequest) {
		return new ResponseEntity<>("선택한 악보 삭제 성공", HttpStatus.OK);
	}

	/** 유저의 악보 이름 수정하기 */
	@PutMapping("/modifyName")
	public ResponseEntity<String> modify(@RequestBody ModifyRequest modifyRequest){
		return new ResponseEntity<>("악보 이름 수정 성공", HttpStatus.OK);
	}
}
