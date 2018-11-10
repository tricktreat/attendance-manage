package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBQd;
import cn.ibilidi.entity.TBQdCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBQdMapper {
    long countByExample(TBQdCriteria example);

    int deleteByExample(TBQdCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBQd record);

    int insertSelective(TBQd record);

    List<TBQd> selectByExample(TBQdCriteria example);

    TBQd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBQd record, @Param("example") TBQdCriteria example);

    int updateByExample(@Param("record") TBQd record, @Param("example") TBQdCriteria example);

    int updateByPrimaryKeySelective(TBQd record);

    int updateByPrimaryKey(TBQd record);
}