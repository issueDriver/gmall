package com.zuojie.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zuojie.gmall.bean.PmsBaseAttrValue;
import com.zuojie.gmall.service.AttrValueService;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Author:zuojie
 */
@Controller
public class AttrValue {
    @Reference
    AttrValueService attrValueService;
    public List<PmsBaseAttrValue> pmsBaseAttrValues(){
        return null;
    }


}
