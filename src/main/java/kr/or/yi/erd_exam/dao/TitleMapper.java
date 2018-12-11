package kr.or.yi.erd_exam.dao;

import java.util.List;

import kr.or.yi.erd_exam.dto.Title;

public interface TitleMapper {
	List<Title> selectTitleByAll();
	
	Title selectTitleByCode(Title title);
	
	int insertTitle(Title title);
	
	int deleteTitle(int code);
	
	int updateTitle(Title title);
}
