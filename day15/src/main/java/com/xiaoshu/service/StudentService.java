package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.dao.TeacherMapper;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;
import com.xiaoshu.entity.Teacher;

@Service
public class StudentService {

	@Autowired
	private StudentMapper sm;
	
	
	@Autowired
	private TeacherMapper tm;
	
	public PageInfo<StudentVo> findPage(StudentVo studentVo,Integer pageNum,Integer pageSize,String ordername,String order){
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> list = sm.findAll(studentVo);
		PageInfo<StudentVo> page = new PageInfo<>(list);
		return page;
	}

	public List<Teacher> findTeacher() {
		List<Teacher> list = tm.selectAll();
		return list;
	}
	public List<StudentVo> countStu() {
		return sm.countStu();
	}
	public Student findByName(String name){
		Student param = new Student();
		param.setName(name);
		return sm.selectOne(param );
	}

	public void updateStu(Student student) {
		// TODO Auto-generated method stub
		sm.updateByPrimaryKeySelective(student);
	}

	public void addStu(Student student) {
		// TODO Auto-generated method stub
		sm.insert(student);
	}
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		tm.insert(teacher);
	}
}
