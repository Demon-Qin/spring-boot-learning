package soft1921.boot.mybatis.mapper;

import soft1921.boot.mybatis.domain.Clazz;

public interface ClazzMapper {
    /*
    * clazzId
    * 查询到的班级对象
    * */
  Clazz getClazzOneToMany(int clazzId);

   /*
   根据班级id查询班级
   * */
    Clazz getClazz(int clazzId);
}