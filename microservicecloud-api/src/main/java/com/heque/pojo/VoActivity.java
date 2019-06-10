package com.heque.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class VoActivity {
	/**  */
    private Integer id;
    /** 活动名称 */
    private String actName;
    /** 活动类型 */
    private Short actType;
    /** 活动开始时间 */
    private Date activityStartTime;
    /** 活动结束时间 */
    private Date activityEndTime;
    /** 数据创建时间 */
    private Date createTime;
    /** 数据修改时间 */
    private Date updateTime;
    /** 活动描述 */
    private String actDesc;
    /** 1:活动中，2已结束 */
    private String actStatus;
    /** 1正常 0 删除 */
    private Short isDel;
    /** 备注 */
    private String marks;
    /** 奖品内容 */
    private String actContent;
}
