package com.zuojie.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zuojie.gmall.bean.PmsProductImage;
import com.zuojie.gmall.bean.PmsProductInfo;
import com.zuojie.gmall.bean.PmsProductSaleAttr;
import com.zuojie.gmall.manage.util.PmsUploadUtil;
import com.zuojie.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {
    @Reference
    SpuService spuService;

    @RequestMapping("spuImageList")
    @ResponseBody
    public List<PmsProductImage> spuImageList(String spuId){

        List<PmsProductImage> pmsProductImages = spuService.spuImageList(spuId);
        return pmsProductImages;
    }

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3ld){
        List<PmsProductInfo> pmsProductInfos=  spuService.spuList(catalog3ld);
        return pmsProductInfos;
    }

    /**
     * 查询销售属性
     * @param spuId
     * @return
     */

    @RequestMapping("spuSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){

        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrList(spuId);
        return pmsProductSaleAttrs;
    }

    /**
     * 文件上传
     *
     */
    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        //1.将文件或者音视屏上传到分布式文件存储系统
        //2.将图片的存储路径返回给页面
        String imgUrl = PmsUploadUtil.uploadImage(multipartFile);
        System.out.println(imgUrl);
        return imgUrl;

    }

    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        spuService.saveSpuInfo(pmsProductInfo);
        return "success";
    }

}
