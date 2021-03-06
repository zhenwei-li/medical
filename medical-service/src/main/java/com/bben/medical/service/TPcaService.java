package com.bben.medical.service;

import com.bben.common.PageInfo;
import com.bben.medical.model.medical.TPca;

import java.util.List;
import java.util.Map;

public interface TPcaService {
    TPca selectByPrimaryKey(String pcaCode);

    int deleteByPrimaryKey(String pcaCode);

    TPca insertSelective(TPca record);

    TPca updateByPrimaryKey(TPca record);

    /**
     * 多条件查询，找出符合条件的记录
     *
     * @param record   用户信息
     * @param pageNum  页号
     * @param pageSize 每页显示记录数
     * @return
     */
    PageInfo<TPca> findByCondition(TPca record, int pageNum, int pageSize);

    /**
     * 根据市和区获取Pca_Code
     *
     * @param
     * @return
     */
    TPca getForCityAndArea(String city, String area);
}
