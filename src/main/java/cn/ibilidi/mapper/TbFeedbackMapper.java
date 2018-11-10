package cn.ibilidi.mapper;

import cn.ibilidi.entity.TbFeedback;
import cn.ibilidi.entity.TbFeedbackCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFeedbackMapper {
    long countByExample(TbFeedbackCriteria example);

    int deleteByExample(TbFeedbackCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFeedback record);

    int insertSelective(TbFeedback record);

    List<TbFeedback> selectByExample(TbFeedbackCriteria example);

    TbFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFeedback record, @Param("example") TbFeedbackCriteria example);

    int updateByExample(@Param("record") TbFeedback record, @Param("example") TbFeedbackCriteria example);

    int updateByPrimaryKeySelective(TbFeedback record);

    int updateByPrimaryKey(TbFeedback record);
}