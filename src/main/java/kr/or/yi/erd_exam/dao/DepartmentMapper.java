package kr.or.yi.erd_exam.dao;

import java.util.List;

import kr.or.yi.erd_exam.dto.Department;

public interface DepartmentMapper {
	List<Department> selectDepartmentByAll();
	
	Department selectDepartmentByDeptNo(Department department);
	
	int insertDepartment(Department department);
	
	int deleteDepartment(Department department);
	
	int updateDepartment(Department department);
	
}
