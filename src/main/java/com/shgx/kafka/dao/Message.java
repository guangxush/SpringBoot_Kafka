package com.shgx.kafka.dao;

import lombok.Data;
import java.util.Date;

/**
 * Created by guangxush on 2018/8/27
 */
@Data
public class Message {
    private Long id;    //id

    private String msg; //message

    private Date sendTime;  //datatime

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
