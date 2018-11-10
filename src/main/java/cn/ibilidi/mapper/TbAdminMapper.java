package cn.ibilidi.mapper;

import cn.ibilidi.entity.TbAdmin;
import cn.ibilidi.entity.TbAdminCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminMapper {
    long countByExample(TbAdminCriteria example);

    int deleteByExample(TbAdminCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdmin record);

    int insertSelective(TbAdmin record);

    List<TbAdmin> selectByExample(TbAdminCriteria example);

    TbAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdmin record, @Param("example") TbAdminCriteria example);

    int updateByExample(@Param("record") TbAdmin record, @Param("example") TbAdminCriteria example);

    int updateByPrimaryKeySelective(TbAdmin record);

    int updateByPrimaryKey(TbAdmin record);
}