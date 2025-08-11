package com.sky.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */
    // @Select("select setmeal_id from setmeal_dish where dish_id = #{dishIds}")
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

}
