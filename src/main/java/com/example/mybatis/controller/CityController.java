package com.example.mybatis.controller;

import com.example.mybatis.domain.City;
import com.example.mybatis.domain.CityExample;
import com.example.mybatis.mapper.CityMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityMapper cityMapper;

    public CityController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @GetMapping("/{id}")
    public City show(@PathVariable Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @PostMapping
    public City create(@RequestBody City city) {
        cityMapper.insertSelective(city);
        return city;
    }
}
