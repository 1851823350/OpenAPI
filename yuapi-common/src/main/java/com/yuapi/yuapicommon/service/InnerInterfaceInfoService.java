package com.yuapi.yuapicommon.service;


import com.yuapi.yuapicommon.model.entity.InterfaceInfo;

/**
 *
 */
public interface InnerInterfaceInfoService {

    /*
     * 查询接口是否存在
     * @author 吴先森
     * @date 2023/1/14 16:01
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
