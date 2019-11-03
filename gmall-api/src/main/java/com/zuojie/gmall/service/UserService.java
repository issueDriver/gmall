package com.zuojie.gmall.service;

import com.zuojie.gmall.bean.UmsMember;
import com.zuojie.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
