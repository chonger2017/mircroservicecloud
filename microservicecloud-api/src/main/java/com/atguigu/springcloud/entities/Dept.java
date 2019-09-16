package com.atguigu.springcloud.entities;

import java.io.Serializable;

import javax.sound.midi.Track;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Dept(Entiy) orm mysql -> Dept (table) 类表关系映射
 * @author dongshuaihu
 *
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{

	private Long deptno; //主键
	private String dname; //部门名称
	private String db_source; //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息存储到不同数据库
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
	}
}
