package com.zuojie.gmall.service;

import com.zuojie.gmall.bean.PmsProductImage;
import com.zuojie.gmall.bean.PmsProductInfo;
import com.zuojie.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3ld);

    /**
     * 保存spu信息
     * @param pmsProductInfo
     */
    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    /**
     * 销售属性
     * @param spuId
     * @return
     */
    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    /**
     * 图拍呢
     * @param spuId
     * @return
     */

    List<PmsProductImage> spuImageList(String spuId);


}
