package com.cangzhousc.mydemo1.mapper;

import com.cangzhousc.mydemo1.model.City;
import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
    //
}