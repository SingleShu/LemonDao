package com.example.administrator.lemondao.dataModel;


import com.example.lemonlibrary.db.annotion.DbField;
import com.example.lemonlibrary.db.annotion.DbPrimaryField;
import com.example.lemonlibrary.db.annotion.DbTable;

/**
 * Created by ShuWen on 2017/2/9.
 */

@DbTable(value = "tb_user")
public class User {

    @DbPrimaryField(value = "id")
    private int id;
    @DbField(value = "user_name")
    private String name;
    @DbField(value = "user_address")
    private String address;
    @DbField(value = "user_psw")
    private String psw;
    @DbField(value = "user_status")
    private int status;
    @DbField(value = "user_id")
    private String user_id;
    @DbField(value = "isMe")
    private boolean isMe;
    @DbField(value = "myAge")
    private double myAge;
    @DbField(value = "myPhone")
    private long myPhone;
    @DbField(value = "aShort")
    private short aShort;

    public User(String name, String address, String psw, int status, String user_id, boolean isMe, double myAge, long myPhone, short aShort) {
        this.name = name;
        this.address = address;
        this.psw = psw;
        this.status = status;
        this.user_id = user_id;
        this.isMe = isMe;
        this.myAge = myAge;
        this.myPhone = myPhone;
        this.aShort = aShort;
    }

    public User() {
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public boolean isMe() {
        return isMe;
    }

    public void setMe(boolean me) {
        isMe = me;
    }

    public double getMyAge() {
        return myAge;
    }

    public void setMyAge(double myAge) {
        this.myAge = myAge;
    }

    public long getMyPhone() {
        return myPhone;
    }

    public void setMyPhone(long myPhone) {
        this.myPhone = myPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", psw='" + psw + '\'' +
                ", status=" + status +
                ", user_id='" + user_id + '\'' +
                ", isMe=" + isMe +
                ", myAge=" + myAge +
                ", myPhone=" + myPhone +
                ", aShort=" + aShort +
                '}';
    }
}
