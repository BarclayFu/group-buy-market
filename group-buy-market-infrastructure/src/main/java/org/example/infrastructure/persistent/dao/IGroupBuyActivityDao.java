package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.GroupBuyActivity;

import java.util.List;
@Mapper
public interface IGroupBuyActivityDao {
    List<GroupBuyActivity> queryGroupBuyActivityList();
}
