package com.cclinux.projects.meetschool.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetschool.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetSchoolUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
