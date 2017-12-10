package cn.abtion.neuqercc.mine.models;

import java.util.List;

import cn.abtion.neuqercc.base.models.BaseModel;
import cn.abtion.neuqercc.home.models.InitCrouselFigureRequest;

/**
 * @author fhyPayaso
 * @since 2017/11/29 18:07
 * email fhyPayaso@qq.com
 */

public class PersonInformationRequest extends BaseModel {

    private String phone;
    private String username;
    private String name;
    private String gender;
    private String good_at;
    private int team_num;
    private String grade;
    private String studentid;
    private String major;
    private String pic;

    public PersonInformationRequest() {

    }

    /**
     * 获取手机号
     * @return
     */

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * 获取用户名
     * @return
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取真实姓名
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     * @return
     */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取擅长方向
     * @return
     */
    public String getGoodAt() {
        return good_at;
    }

    public void setGoodAt(String goodAt) {
        this.good_at = goodAt;
    }

    /**
     * 获取擅长方向
     * @return
     */
    public int getTeamNum() {
        return team_num;
    }

    public void setTeamNum(int teamNum) {
        this.team_num = teamNum;
    }


    /**
     * 获取图片url
     * @return
     */
    public String getPicture() {
        return pic;
        
    }

    public void setPicture(String picture) {
        this.pic = picture;
    }



    /**
     * 获取年级
     */
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    /**
     * 获取学号
     */
    public String getStudentId() {
        return studentid;
    }

    public void setStudentId(String studentid) {
        this.studentid = studentid;
    }


    /**
     * 获取专业
     */
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
