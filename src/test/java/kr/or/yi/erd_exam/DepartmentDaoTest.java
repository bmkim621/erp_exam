package kr.or.yi.erd_exam;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.erd_exam.dao.DepartmentMapper;
import kr.or.yi.erd_exam.dao.DepartmentMapperImpl;
import kr.or.yi.erd_exam.dto.Department;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest extends AbstractTest {
	private static DepartmentMapper deptDao = new DepartmentMapperImpl();
	
	@Test
	public void test01insertDept() {
	log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Department dept = new Department();
		dept.setDeptName("연구");
		dept.setDeptNo("D006");
		dept.setFloor(20);
		
		int res = deptDao.insertDepartment(dept);
		Assert.assertEquals(1, res);	
	}
	
	@Test
	public void test02selectDeptByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		List<Department> deptList = deptDao.selectDepartmentByAll();
		Assert.assertNotNull(deptList);
	}
	
	@Test
	public void test03selectDeptByDeptNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Department dept = new Department();
		dept.setDeptNo("D006");
		Department searchDept = deptDao.selectDepartmentByDeptNo(dept);
		Assert.assertNotNull(searchDept);
		
		log.debug("searchDepartment : " + searchDept);
	}
	
	@Test
	public void test04updateDept() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Department dept = new Department();
		dept.setDeptNo("D006");
		dept.setDeptName("회계");
		dept.setFloor(15);
		
		int res = deptDao.updateDepartment(dept);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteDept() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
		Department delDept = new Department("D006");
		int res = deptDao.deleteDepartment(delDept);
		Assert.assertEquals(1, res);
	}

}
