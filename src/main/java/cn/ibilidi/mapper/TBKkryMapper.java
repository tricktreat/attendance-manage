package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBKkry;
import cn.ibilidi.entity.TBKkryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBKkryMapper {
    long countByExample(TBKkryCriteria example);

    int deleteByExample(TBKkryCriteria example);

    int insert(TBKkry record);

    int insertSelective(TBKkry record);

    List<TBKkry> selectByExample(TBKkryCriteria example);

    int updateByExampleSelective(@Param("record") TBKkry record, @Param("example") TBKkryCriteria example);

    int updateByExample(@Param("record") TBKkry record, @Param("example") TBKkryCriteria example);
}