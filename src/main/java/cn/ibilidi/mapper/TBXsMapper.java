package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBXs;
import cn.ibilidi.entity.TBXsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBXsMapper {
    long countByExample(TBXsCriteria example);

    int deleteByExample(TBXsCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TBXs record);

    int insertSelective(TBXs record);

    List<TBXs> selectByExample(TBXsCriteria example);

    TBXs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TBXs record, @Param("example") TBXsCriteria example);

    int updateByExample(@Param("record") TBXs record, @Param("example") TBXsCriteria example);

    int updateByPrimaryKeySelective(TBXs record);

    int updateByPrimaryKey(TBXs record);
}