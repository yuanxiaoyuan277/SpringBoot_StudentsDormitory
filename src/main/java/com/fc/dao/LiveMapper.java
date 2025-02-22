package com.fc.dao;

import com.fc.entity.Live;
import com.fc.entity.LiveExample;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface LiveMapper {
    long countByExample(LiveExample example);

    int deleteByExample(LiveExample example);

    int deleteByPrimaryKey(String id);

    int insert(Live row);

    int insertSelective(Live row);

    List<Live> selectByExample(LiveExample example);

    Live selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("row") Live row, @Param("example") LiveExample example);

    int updateByExample(@Param("row") Live row, @Param("example") LiveExample example);

    int updateByPrimaryKeySelective(Live row);

    int updateByPrimaryKey(Live row);
}