package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBQddd;
import cn.ibilidi.entity.TBQdddCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBQdddMapper {
    long countByExample(TBQdddCriteria example);

    int deleteByExample(TBQdddCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBQddd record);

    int insertSelective(TBQddd record);

    List<TBQddd> selectByExample(TBQdddCriteria example);

    TBQddd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBQddd record, @Param("example") TBQdddCriteria example);

    int updateByExample(@Param("record") TBQddd record, @Param("example") TBQdddCriteria example);

    int updateByPrimaryKeySelective(TBQddd record);

    int updateByPrimaryKey(TBQddd record);
}