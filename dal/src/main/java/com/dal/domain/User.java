package com.dal.domain;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/25 8:02 下午
 * description：mybatis-generator自动生成，勿随意修改
 */
public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Jan 27 16:37:02 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userName
     *
     * @mbg.generated Thu Jan 27 16:37:02 CST 2022
     */
    private String username;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Jan 27 16:37:02 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Jan 27 16:37:02 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userName
     *
     * @return the value of user.userName
     *
     * @mbg.generated Thu Jan 27 16:37:02 CST 2022
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userName
     *
     * @param username the value for user.userName
     *
     * @mbg.generated Thu Jan 27 16:37:02 CST 2022
     */
    public void setUsername(String username) {
        this.username = username;
    }
}