package com.smapley.blog.modules.userinfo;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author EricNts
 * @date 2018/4/22
 */
@Transactional(rollbackFor = Exception.class)
public interface UserService {
}
