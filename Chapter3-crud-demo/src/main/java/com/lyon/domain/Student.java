package com.lyon.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Student {
    /**
     * id
     */
    private Integer id;
    /**
     * 证件类型：1：身份证号，2：其他
     */
    private Integer type;
    /**
     * 证件号码
     */
    private String number;
    /**
     * 姓名
     */
    private String name;
    /**
     * 核酸检验结果:0:阴性，1:阳性
     */
    private Integer	checkResult;
    /**
     * 核酸检验时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkTime;
    /**
     * 是否密接人员：0：否，1：是
     */
    private Integer	isCloseContact;
    /**
     * 健康码状态：0：绿，1：黄，2：红
     */
    private Integer status;

}
