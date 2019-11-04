package com.trade.api.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * An authority (a security role) used by Spring Security.
 */
@Entity
@Table(name = "base_url", schema = "tradeanalytics")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BaseUrl implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String url;

    @NotNull
    @Column(name = "key_name")
    private String keyName;

    @NotNull
    @Column(name = "version_no")
    private String versionNo;

    @NotNull
    @Column(name = "executed_date")
    private Date executedDate;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public void setExecutedDate(Date executedDate) {
        this.executedDate = executedDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public Date getExecutedDate() {
        return executedDate;
    }
}
