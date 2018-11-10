package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBKc;
import cn.ibilidi.entity.TBKcCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBKcMapper {
    long countByExample(TBKcCriteria example);

    int deleteByExample(TBKcCriteria example);

    int deleteByPrimaryKey(String kch);

    int insert(TBKc record);

    int insertSelective(TBKc record);

    List<TBKc> selectByExample(TBKcCriteria example);

    TBKc selectByPrimaryKey(String kch);

    int updateByExampleSelective(@Param("record") TBKc record, @Param("example") TBKcCriteria example);

    int updateByExample(@Param("record") TBKc record, @Param("example") TBKcCriteria example);

    int updateByPrimaryKeySelective(TBKc record);

    int updateByPrimaryKey(TBKc record);
}