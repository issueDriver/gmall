package com.zuojie.gmall.service;

import com.zuojie.gmall.bean.PmsBaseAttrInfo;
import com.zuojie.gmall.bean.PmsBaseAttrValue;
import com.zuojie.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService  {
    /**
     * 查询属性信息
     * @param catalog3Id
     * @return
     */
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    /**
     * 保存属性信息
     * @param pmsBaseAttrInfo
     * @return
     */
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    /**
     * 获取销售属性
     * @return
     */
    List<PmsBaseSaleAttr> baseSaleAttrs();
}
