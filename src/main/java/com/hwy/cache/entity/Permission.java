package com.hwy.cache.entity;

public class Permission {
    private Integer id;

    private String url;

    private String permession;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPermession() {
        return permession;
    }

    public void setPermession(String permession) {
        this.permession = permession == null ? null : permession.trim();
    }
}