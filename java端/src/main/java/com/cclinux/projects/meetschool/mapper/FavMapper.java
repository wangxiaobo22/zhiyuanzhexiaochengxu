package com.cclinux.projects.meetschool.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetschool.model.FavModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetSchoolFavMapper")
@Mapper
public interface FavMapper extends ProjectBaseMapper<FavModel> {
}
