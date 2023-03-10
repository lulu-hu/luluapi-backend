package com.lulu.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lulu.luluapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
