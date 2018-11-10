package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBJs;
import cn.ibilidi.entity.TBJsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBJsMapper {
    long countByExample(TBJsCriteria example);

    int deleteByExample(TBJsCriteria example);

    int deleteByPrimaryKey(String jsh);

    int insert(TBJs record);

    int insertSelective(TBJs record);

    List<TBJs> selectByExample(TBJsCriteria example);

    TBJs selectByPrimaryKey(String jsh);

    int updateByExampleSelective(@Param("record") TBJs record, @Param("example") TBJsCriteria example);

    int updateByExample(@Param("record") TBJs record, @Param("example") TBJsCriteria example);

    int updateByPrimaryKeySelective(TBJs record);

    int updateByPrimaryKey(TBJs record);
}