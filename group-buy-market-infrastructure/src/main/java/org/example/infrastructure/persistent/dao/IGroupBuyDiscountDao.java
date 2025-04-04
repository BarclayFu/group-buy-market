package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.GroupBuyDiscount;

import java.util.List;
@Mapper
public interface IGroupBuyDiscountDao {
    List<GroupBuyDiscount> queryGroupBuyDiscountList();
}
