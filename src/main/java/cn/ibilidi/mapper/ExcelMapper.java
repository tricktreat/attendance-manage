package cn.ibilidi.mapper;

import cn.ibilidi.entity.*;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface ExcelMapper {

    void batchXkInsert(List<TBXk> tbXks);
    void batchKcInsert(List<TBKc> tbKcs);
    void batchXsInsert(List<TBXs> tbXs);
    void batchJsInsert(List<TBJs> tbJs);
    void batchUserInsert(List<TBUser> tbUsers);
    void batchGlkcInsert(List<TBGlkc> tbGlkcList);
}
