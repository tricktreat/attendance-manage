package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBXk;
import cn.ibilidi.entity.TBXkCriteria;
import cn.ibilidi.entity.TBXkKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBXkMapper {
    long countByExample(TBXkCriteria example);

    int deleteByExample(TBXkCriteria example);

    int deleteByPrimaryKey(TBXkKey key);

    int insert(TBXk record);

    int insertSelective(TBXk record);

    List<TBXk> selectByExample(TBXkCriteria example);

    TBXk selectByPrimaryKey(TBXkKey key);

    int updateByExampleSelective(@Param("record") TBXk record, @Param("example") TBXkCriteria example);

    int updateByExample(@Param("record") TBXk record, @Param("example") TBXkCriteria example);

    int updateByPrimaryKeySelective(TBXk record);

    int updateByPrimaryKey(TBXk record);
}