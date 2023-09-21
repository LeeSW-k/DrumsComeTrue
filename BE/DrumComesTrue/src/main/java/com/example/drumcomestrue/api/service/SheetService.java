package com.example.drumcomestrue.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.drumcomestrue.common.error.NotFoundException;
import com.example.drumcomestrue.common.exception.ApplicationError;
import com.example.drumcomestrue.db.entity.Sheet;
import com.example.drumcomestrue.db.entity.User;
import com.example.drumcomestrue.db.repository.SheetRepository;
import com.example.drumcomestrue.db.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SheetService {

	private final SheetRepository sheetRepository;
	private final UserRepository userRepository;

	// public List<Sheet> findSheets(String userId) {
	public List<Sheet> findSheets(String userId) {
		/* 유저 있는지 찾음 */
		checkUserExists(userId);

		/* 유저의 pk찾아 그 pk로 악보 목록 추출 */
		User findUser = userRepository.findByUserId(userId);
		return sheetRepository.findByUser_UserPk(findUser.getUserPk());
	}

	/** 악보 제작 */
	public void create(String userId, MultipartFile file) {

	}

	/** 악보 하나 삭제 */
	public void remove(String userId, List<Long> sheetPkList) {

	}

	/** 악보 여러개 삭제 */
	public void removeChecked(String userId, List<Long> sheetPkList) {

	}

	/** 악보 이름 수정 */
	public void modifyName(String userId, long sheetPk) {

	}

	/** userId로 존재하는 유저인지 판별 */
	public void checkUserExists(String userId) {
		if (!userRepository.existsByUserId(userId)) {
			throw new NotFoundException(ApplicationError.MEMBER_NOT_FOUND);
		}
	}

}
