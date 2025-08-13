package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.entity.Setmeal;

public interface SetmealService {
    /**
     * 新增套餐
     * @param setmealDTO
     */
    void save(SetmealDTO setmealDTO);
}
