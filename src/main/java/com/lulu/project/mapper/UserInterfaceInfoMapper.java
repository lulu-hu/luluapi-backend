package com.lulu.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lulu.luluapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.yupi.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




