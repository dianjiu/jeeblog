package cn.org.dianjiu.server.dao;

import cn.org.dianjiu.server.entity.TFile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * (TFile)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-05 21:30:46
 */
@Mapper
public interface TFileDao {

    /**
     * 通过Id查询单个对象
     *
     * @param id 主键
     * @return 实例对象
     */
    TFile getById(@NotNull Integer id);

    /**
     * 通过实体不为空的属性作为筛选条件查询对象列表
     *
     * @param tFile 实例对象
     * @return 对象列表
     */
    List<TFile> listByEntity(TFile tFile);

    /**
     * 通过实体不为空的属性作为筛选条件查询单个对象
     *
     * @param tFile
     * @return 实例对象
     */
    TFile getByEntity(TFile tFile);

    /**
     * 通过Id列表作为筛选条件查询对象列表，列表长度不为0
     *
     * @param list 实例对象
     * @return 对象列表
     */
    List<TFile> listByIds(@NotEmpty List<Integer> list);

    /**
     * 新增实体属性不为null的记录
     *
     * @param tFile 实例对象
     * @return 影响行数
     */
    int insert(@NotNull TFile tFile);

    /**
     * 批量新增所有列，列表长度不能为0，且列表id统一为null或者统一不为null
     *
     * @param list 实例对象
     * @return 影响行数
     */
    int insertBatch(@NotEmpty List<TFile> list);

    /**
     * 通过主键修改实体属性不为null的列
     *
     * @param tFile 实例对象
     * @return 影响行数
     */
    int update(@NotNull TFile tFile);

    /**
     * 通过表字段修改实体属性不为null的列
     *
     * @param where 实例对象
     * @param set   实例对象
     * @return 影响行数
     */
    int updateByField(@NotNull @Param("where") TFile where, @NotNull @Param("set") TFile set);

    /**
     * 通过主键修改实体列表，列表长度不能为0，注意：当实体属性为null时，对应的列也会别更新为null
     *
     * @param list 实例对象
     * @return 影响行数
     */
    int updateBatch(@NotEmpty List<TFile> list);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(@NotNull Integer id);

    /**
     * 通过实体非空属性删除
     *
     * @param tFile 实例对象
     * @return 影响行数
     */
    int deleteByEntity(@NotNull TFile tFile);

    /**
     * 通过主键列表删除，列表长度不能为0
     *
     * @param list 实例对象
     * @return 影响行数
     */
    int deleteByIds(@NotEmpty List<Integer> list);

    int countAll();

    int countByEntity(TFile tFile);

}