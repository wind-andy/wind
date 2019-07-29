package com.wind.system.mapper;

import com.wind.system.model.Test;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    List<Test> getTestInfo();
}