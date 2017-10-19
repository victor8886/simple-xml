package com.example.dell.oppoadb;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by dell on 2017/8/3.
 */

@Root(name = "EPOSPROTOCOL")
public class MerchantListResponse {
    @Element(name = "RSPMSG", required = false)
    private String msg;
    @Element(name = "RSPCOD", required = false)
    private String rescode;
    @ElementList(name = "ROUTE_DETAILS", required = false)
    private List<MerchantBean> beanList;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Element(name = "TOTAL",required = false)
    private int total;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRescode() {
        return rescode;
    }

    public void setRescode(String rescode) {
        this.rescode = rescode;
    }

    public List<MerchantBean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<MerchantBean> beanList) {
        this.beanList = beanList;
    }

    @Root(name = "ROUTE_DETAIL")
    public static class MerchantBean {
        @Element(name = "NAME")
        private String name;
        @Element(name = "CODE")
        private String code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
