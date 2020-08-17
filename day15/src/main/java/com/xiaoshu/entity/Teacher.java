package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Teacher implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 教师名称
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    /**
     * 入校时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date entrytime;

    /**
     * 创建实间
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
     * 获取教师名称
     *
     * @return name - 教师名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置教师名称
     *
     * @param name 教师名称
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
     * 获取创建实间
     *
     * @return createtime - 创建实间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建实间
     *
     * @param createtime 创建实间
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
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", entrytime=").append(entrytime);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}