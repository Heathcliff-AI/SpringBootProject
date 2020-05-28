package com.example.github.dao;

import com.example.github.entity.TbArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (TbArea)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 23:29:38
 */
@Repository
public interface TbAreaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param areaId 主键
     * @return 实例对象
     */
    TbArea queryById(Integer areaId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbArea> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbArea 实例对象
     * @return 对象列表
     */
    List<TbArea> queryAll(TbArea tbArea);

    /**
     * 新增数据
     *
     * @param tbArea 实例对象
     * @return 影响行数
     */
    int insert(TbArea tbArea);

    /**
     * 修改数据
     *
     * @param tbArea 实例对象
     * @return 影响行数
     */
    int update(TbArea tbArea);

    /**
     * 通过主键删除数据
     *
     * @param areaId 主键
     * @return 影响行数
     */
    int deleteById(Integer areaId);

}