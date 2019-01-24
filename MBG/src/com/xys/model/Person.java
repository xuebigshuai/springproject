package com.xys.model;

import java.util.Date;

public class Person {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.id
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.name
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.age
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.salary
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private Double salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.birth
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private Date birth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.registerTime
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private Date registertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_person.courseid
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    private Integer courseid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.id
     *
     * @return the value of tbl_person.id
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.id
     *
     * @param id the value for tbl_person.id
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.name
     *
     * @return the value of tbl_person.name
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.name
     *
     * @param name the value for tbl_person.name
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.age
     *
     * @return the value of tbl_person.age
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.age
     *
     * @param age the value for tbl_person.age
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.salary
     *
     * @return the value of tbl_person.salary
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.salary
     *
     * @param salary the value for tbl_person.salary
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.birth
     *
     * @return the value of tbl_person.birth
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.birth
     *
     * @param birth the value for tbl_person.birth
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.registerTime
     *
     * @return the value of tbl_person.registerTime
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.registerTime
     *
     * @param registertime the value for tbl_person.registerTime
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_person.courseid
     *
     * @return the value of tbl_person.courseid
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_person.courseid
     *
     * @param courseid the value for tbl_person.courseid
     *
     * @mbggenerated Sun Jun 24 14:54:01 CST 2018
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }
}