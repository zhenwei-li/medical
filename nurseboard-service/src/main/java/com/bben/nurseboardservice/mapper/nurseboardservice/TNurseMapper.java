package com.bben.nurseboardservice.mapper.nurseboardservice;

import com.bben.nurseboardservice.model.nurseboardservice.TNurse;
import com.bben.nurseboardservice.model.nurseboardservice.TNurseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNurseMapper {
    long countByExample(TNurseExample example);

    int deleteByExample(TNurseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TNurse record);

    int insertSelective(TNurse record);

    List<TNurse> selectByExample(TNurseExample example);

    TNurse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TNurse record, @Param("example") TNurseExample example);

    int updateByExample(@Param("record") TNurse record, @Param("example") TNurseExample example);

    int updateByPrimaryKeySelective(TNurse record);

    int updateByPrimaryKey(TNurse record);
}