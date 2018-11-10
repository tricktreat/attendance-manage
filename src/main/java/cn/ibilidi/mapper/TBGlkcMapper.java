package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBGlkc;
import cn.ibilidi.entity.TBGlkcCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBGlkcMapper {
    long countByExample(TBGlkcCriteria example);

    int deleteByExample(TBGlkcCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBGlkc record);

    int insertSelective(TBGlkc record);

    List<TBGlkc> selectByExample(TBGlkcCriteria example);

    TBGlkc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBGlkc record, @Param("example") TBGlkcCriteria example);

    int updateByExample(@Param("record") TBGlkc record, @Param("example") TBGlkcCriteria example);

    int updateByPrimaryKeySelective(TBGlkc record);

    int updateByPrimaryKey(TBGlkc record);
}