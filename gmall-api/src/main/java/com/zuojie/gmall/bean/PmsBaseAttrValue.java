package com.zuojie.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @Author:zuojie
 */
public class PmsBaseAttrValue implements Serializable {
    @Column
    @Id
    private String id;
    /**
     * 属性值名称
     */
    @Column
    private  String  valueName;

    /**
     * 属性id
     */
    @Column
    private String attrId;

    /**
     * 是否启用
     */
    @Column
    private String isEnabled;

    @Transient
    private  String urlParam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }
}
