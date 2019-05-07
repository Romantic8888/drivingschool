package com.df.service;

import java.util.List;

import com.df.domain.Student;
import com.df.page.Page;

public interface StudentService {
	int deleteByPrimaryKey(Integer id);

	int insert(Student record);

	int insertSelective(Student record);

	Student selectByPrimaryKey(Integer id);

	List<Student> selectAll();

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);

	// ��ҳ��ģ����ѯ
	public Page<Student> pageFuzzyselect(String roomNumber, Page<Student> vo);
}