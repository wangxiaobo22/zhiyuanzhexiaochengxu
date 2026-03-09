package com.cclinux.projects.meetschool.service.cust;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cclinux.framework.core.mapper.UpdateWhere;
import com.cclinux.framework.core.mapper.Where;
import com.cclinux.framework.helper.FakerHelper;
import com.cclinux.framework.helper.TimeHelper;
import com.cclinux.projects.meetschool.mapper.MeetJoinMapper;
import com.cclinux.projects.meetschool.mapper.MeetMapper;
import com.cclinux.projects.meetschool.mapper.UserMapper;
import com.cclinux.projects.meetschool.model.MeetJoinModel;
import com.cclinux.projects.meetschool.model.MeetModel;
import com.cclinux.projects.meetschool.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Notes: 活动模块业务逻辑
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */

@Service("MeetSchoolTestService")
public class TestService extends BaseMyCustService {

    @Resource(name = "MeetSchoolMeetMapper")
    private MeetMapper meetMapper;

    @Resource(name = "MeetSchoolMeetJoinMapper")
    private MeetJoinMapper meetJoinMapper;

    @Resource(name = "MeetSchoolUserMapper")
    private UserMapper userMapper;


    public void mockMeetSchool() {


    }


}
