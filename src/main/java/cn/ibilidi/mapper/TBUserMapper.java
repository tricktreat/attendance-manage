package cn.ibilidi.mapper;

import cn.ibilidi.entity.TBUser;
import cn.ibilidi.entity.TBUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBUserMapper {
    long countByExample(TBUserCriteria example);

    int deleteByExample(TBUserCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TBUser record);

    int insertSelective(TBUser record);

    List<TBUser> selectByExample(TBUserCriteria example);

    TBUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TBUser record, @Param("example") TBUserCriteria example);

    int updateByExample(@Param("record") TBUser record, @Param("example") TBUserCriteria example);

    int updateByPrimaryKeySelective(TBUser record);

    int updateByPrimaryKey(TBUser record);
}