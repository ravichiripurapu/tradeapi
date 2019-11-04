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
@Table(name = "symbol_hourly", schema = "tradeanalytics")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SymbolHourly implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(name = "transaction_date")
    private Date transactionDate;

    @NotNull
    private Integer hour;

    @NotNull
    private Long volume;

    @NotNull
    private Long open;

    @NotNull
    private Long close;

    @NotNull
    private Long high;

    @NotNull
    private Long low;

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public void setVolume(Long volume) {
        this.volume = volume;
    }
    public void setOpen(Long open) {
        this.open = open;
    }
    public void setClose(Long close) {
        this.close = close;
    }
    public void setHigh(Long high) {
        this.high = high;
    }
    public void setLow(Long low) {
        this.low = low;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public Integer getHour() {
        return hour;
    }
    public Long getVolume() {
        return volume;
    }
    public Long getOpen() {
        return open;
    }
    public Long getClose() {
        return close;
    }
    public Long getHigh() {
        return high;
    }
    public Long getLow() {
        return low;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymbolHourly that = (SymbolHourly) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(transactionDate, that.transactionDate) &&
            Objects.equals(hour, that.hour) &&
            Objects.equals(volume, that.volume) &&
            Objects.equals(open, that.open) &&
            Objects.equals(close, that.close) &&
            Objects.equals(high, that.high) &&
            Objects.equals(low, that.low);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, transactionDate, hour, volume, open, close, high, low);
    }

}
