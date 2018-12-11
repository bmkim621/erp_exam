package kr.or.yi.erd_exam;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.erd_exam.dao.TitleMapper;
import kr.or.yi.erd_exam.dao.TitleMapperImpl;
import kr.or.yi.erd_exam.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoTest extends AbstractTest {
	private static TitleMapper titleDao = new TitleMapperImpl();
	
	@Test
	public void test01insertTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Title title = new Title();
		title.setNo(5);
		title.setTitleName("인턴");
		
		int res = titleDao.insertTitle(title);
		Assert.assertEquals(1, res);		
	}
	
	@Test
	public void test02selectTitleByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		List<Title> titleList = titleDao.selectTitleByAll();
		Assert.assertNotNull(titleList);
	}
	
	@Test
	public void test03selectTitleByCode() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Title title = new Title();
		title.setNo(5);
		Title searchTitle = titleDao.selectTitleByCode(title);
		Assert.assertNotNull(searchTitle);
		
		log.debug("searchTitle : " + searchTitle);
	}
	
	@Test
	public void test04updateTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Title title = new Title();
		title.setNo(5);
		title.setTitleName("무기계약직");
		int res = titleDao.updateTitle(title);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		int res = titleDao.deleteTitle(5);
		Assert.assertEquals(1, res);
	}

}
