package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuapi.yuapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}