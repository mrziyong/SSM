package com.imooc.reader.service;

import com.imooc.reader.entity.Member;

public interface MemberService {
    /**
     * 会员注册，创建新会员
     * @param username
     * @param password
     * @param nickname
     * @return
     */
    public Member createMember(String username, String password, String nickname);
}
