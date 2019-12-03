package com.zuojie.gmall.manage.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.zuojie.gmall.bean.PmsBaseAttrInfo;
import com.zuojie.gmall.bean.PmsBaseAttrValue;
import com.zuojie.gmall.bean.PmsBaseSaleAttr;
import com.zuojie.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:zuojie
 */
@Controller
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public  List<PmsBaseSaleAttr> baseSaleAttrList(){
      List<PmsBaseSaleAttr> pmsBaseSaleAttrs = attrService.baseSaleAttrs();
      return pmsBaseSaleAttrs;
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
     List<PmsBaseAttrInfo> pmsBaseAttrInfos=attrService.attrInfoList(catalog3Id);
     return pmsBaseAttrInfos;

     }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        String success = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }

    /**
     * 根据属性id获取属性值
     * @param attrId
     * @return
     */
    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> attrValueList = attrService.getAttrValueList(attrId);
        return attrValueList;
    }


}
