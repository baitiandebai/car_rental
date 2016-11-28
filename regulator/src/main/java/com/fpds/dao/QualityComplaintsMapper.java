package com.fpds.dao;

import com.fpds.entity.QualityComplaints;

public interface QualityComplaintsMapper {
    int deleteByPrimaryKey(String id);

    int insert(QualityComplaints record);

    int insertSelective(QualityComplaints record);

    QualityComplaints selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QualityComplaints record);

    int updateByPrimaryKey(QualityComplaints record);
}