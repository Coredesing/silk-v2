package com.spark.bitrade.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.spark.bitrade.constant.BooleanEnum;
import com.spark.bitrade.constant.MemberLevelEnum;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Zhang Jinwei
 * @date 2018年01月16日
 */
@Builder
@Data
public class MemberAdvertiseInfo {
    private List<OtcAdvertise> buy;
    private List<OtcAdvertise> sell;
    private String username;
    private String avatar;
    private BooleanEnum realVerified;
    private BooleanEnum emailVerified;
    private BooleanEnum phoneVerified;
    private int transactions;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private MemberLevelEnum memberLevel; //add by tansitao 时间： 2018/11/2 原因：广告主等级
}
