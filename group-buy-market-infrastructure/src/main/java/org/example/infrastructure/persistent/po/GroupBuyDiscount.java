package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

@Data
public class GroupBuyDiscount {
    private Long id;                        // 自增ID
    private Integer discountId;             // 折扣ID
    private String discountName;            // 折扣标题
    private String discountDesc;            // 折扣描述
    private Integer discountType;           // 折扣类型（0:base、1:tag）
    private String marketPlan;              // 营销优惠计划（ZJ:直减、MJ:满减、N元购）
    private String marketExpr;              // 营销优惠表达式
    private String tagId;                   // 人群标签，特定优惠限定
    private Date createTime;                // 创建时间
    private Date updateTime;                // 更新时间
}