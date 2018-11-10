package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBJxl;
import cn.ibilidi.entity.TBJxlCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBJxlMapper {
    long countByExample(TBJxlCriteria example);

    int deleteByExample(TBJxlCriteria example);

    int insert(TBJxl record);

    int insertSelective(TBJxl record);

    List<TBJxl> selectByExample(TBJxlCriteria example);

    int updateByExampleSelective(@Param("record") TBJxl record, @Param("example") TBJxlCriteria example);

    int updateByExample(@Param("record") TBJxl record, @Param("example") TBJxlCriteria example);
}