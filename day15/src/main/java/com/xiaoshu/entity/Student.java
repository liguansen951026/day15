package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 代课老师id
     */
    private Integer teacherid;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    /**
     * 学生编号
     */
    private String code;

    /**
     * 所属年级
     */
    private String grade;

    /**
     * 入校时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date entrytime;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取代课老师id
     *
     * @return teacherid - 代课老师id
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     * 设置代课老师id
     *
     * @param teacherid 代课老师id
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * 获取学生姓名
     *
     * @return name - 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名
     *
     * @param name 学生姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 获取学生编号
     *
     * @return code - 学生编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置学生编号
     *
     * @param code 学生编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取所属年级
     *
     * @return grade - 所属年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置所属年级
     *
     * @param grade 所属年级
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * 获取入校时间
     *
     * @return entrytime - 入校时间
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * 设置入校时间
     *
     * @param entrytime 入校时间
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", code=").append(code);
        sb.append(", grade=").append(grade);
        sb.append(", entrytime=").append(entrytime);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}