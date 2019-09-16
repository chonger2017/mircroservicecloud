package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.atguigu.springcloud.entities.Dept;

@Mapper
public interface DeptDao
{
	@Insert("insert into dept(dname,db_source) values(#{dname},#{db_source})")
	public boolean addDept(Dept dept);

	@Select("select * from dept where deptno=#{param1}")
	public Dept findById(Long id);

	@Select("select * from dept")
	public List<Dept> findAll();
}
