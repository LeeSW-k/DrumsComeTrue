package com.example.drumcomestrue.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.drumcomestrue.db.entity.Sheet;

@Repository
public interface SheetRepository extends JpaRepository<Sheet, Long> {
	Sheet findBySheetPk(Long sheetPk);
	List<Sheet> findByUser_UserPk(Long userPk);
}
