package com.trade.api.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * An authority (a security role) used by Spring Security.
 */
@Entity
@Table(name = "symbol_institutional_ownership", schema = "tradeanalytics")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)

public class SymbolInstitutionalOwnerShip implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(name = "report_date")
    private Timestamp reportDate;

    @NotNull
    @Column(name = "institutional_owner_id")
    private Long institutionalOwnerId;

    @NotNull
    @Column(name = "entity_name")
    private String entityName;

    @NotNull
    @Column(name = "adjusted_holding")
    private Long adjustedHolding;

    @NotNull
    @Column(name = "reported_holding")
    private Long reportedHolding;

    @NotNull
    @Column(name = "adjusted_mv")
    private Long adjustedMv;

    @NotNull
    @Column(name = "created_date")
    private Timestamp createdDate;

    @NotNull
    @Column(name = "data_changed")
    private Boolean dataChanged;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }

    public void setInstitutionalOwnerId(Long institutionalOwnerId) {
        this.institutionalOwnerId = institutionalOwnerId;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setAdjustedHolding(Long adjustedHolding) {
        this.adjustedHolding = adjustedHolding;
    }

    public void setReportedHolding(Long reportedHolding) {
        this.reportedHolding = reportedHolding;
    }

    public void setAdjustedMv(Long adjustedMv) {
        this.adjustedMv = adjustedMv;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public void setDataChanged(Boolean dataChanged) {
        this.dataChanged = dataChanged;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getReportDate() {
        return reportDate;
    }

    public Long getInstitutionalOwnerId() {
        return institutionalOwnerId;
    }

    public String getEntityName() {
        return entityName;
    }

    public Long getAdjustedHolding() {
        return adjustedHolding;
    }

    public Long getReportedHolding() {
        return reportedHolding;
    }

    public Long getAdjustedMv() {
        return adjustedMv;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public Boolean getDataChanged() {
        return dataChanged;
    }

}
