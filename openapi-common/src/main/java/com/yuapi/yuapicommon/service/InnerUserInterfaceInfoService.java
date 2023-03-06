package com.yuapi.yuapicommon.service;

import com.yuapi.yuapicommon.model.entity.InterfaceInfo;
import com.yuapi.yuapicommon.model.entity.User;

/**
 * @author 吴先森
 * @description:
 * @create 2023-01-14 15:59
 */
public interface InnerUserInterfaceInfoService {


    /*
     * 调用接口统计次数
     * @author 吴先森
     * @date 2023/1/14 16:01
     */
    Boolean invokeCount(long interfaceInfoId, long userId);
}
