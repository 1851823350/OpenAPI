package com.yuapi.yuapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yuapi.yuapicommon.model.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService{

    /**
     * 查询数据库是否为用户分配 密钥
     * @author 吴先森
     * @date 2023/1/14 15:59
     */

    User getInvokeUser(String accessKey);

}
