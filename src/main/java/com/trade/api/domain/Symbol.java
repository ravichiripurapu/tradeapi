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
public class Symbol implements Serializable {

    private static final long serialVersionUID = 1L;


    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private String name;

    @NotNull
    private Long volume;


    @NotNull
    @Column(name = "transaction_date")
    private Date transactionDate;

    @NotNull
    private Long open;
    @NotNull
    private Long close;
    @NotNull
    private Long high;
    @NotNull
    private Long low;
    @NotNull
    @Column(name = "volume_adi")
    private Long volumeAdi;
    @NotNull
    @Column(name = "volume_obv")
    private Long volumeObv;
    @NotNull
    @Column(name = "volume_cmf")
    private Long volumeCmf;
    @NotNull
    @Column(name = "volume_fi")
    private Long volumeFi;
    @NotNull
    @Column(name = "volume_em")
    private Long volumeEm;
    @NotNull
    @Column(name = "volume_vpt")
    private Long volumeVpt;
    @NotNull
    @Column(name = "volume_nvi")
    private Long volumeNvi;
    @NotNull
    @Column(name = "momentum_rsi")
    private Long momentumRsi;
    @NotNull
    @Column(name = "momentum_mfi")
    private Long momentumMfi;
    @NotNull
    @Column(name = "momentum_tsi")
    private Long momentumTsi;
    @NotNull
    @Column(name = "momentum_uo")
    private Long momentumUo;
    @NotNull
    @Column(name = "momentum_stoch")
    private Long momentumStoch;
    @NotNull
    @Column(name = "momentum_stoch_signal")
    private Long momentumStochSignal;
    @NotNull
    @Column(name = "momentum_wr")
    private Long momentumWr;
    @NotNull
    @Column(name = "momentum_ao")
    private Long momentumAo;
    @NotNull
    @Column(name = "momentum_kama")
    private Long momentumKama;
    @NotNull
    @Column(name = "trend_macd")
    private Long trendMacd;
    @NotNull
    @Column(name = "trend_macd_signal")
    private Long trendMacdSignal;
    @NotNull
    @Column(name = "trend_macd_diff")
    private Long trendMacdDiff;
    @NotNull
    @Column(name = "trend_ema_fast")
    private Long trendEmaFast;
    @NotNull
    @Column(name = "trend_ema_slow")
    private Long trendEmaSlow;
    @NotNull
    @Column(name = "trend_adx")
    private Long trendAdx;
    @NotNull
    @Column(name = "trend_adx_pos")
    private Long trendAdxPos;
    @NotNull
    @Column(name = "trend_adx_neg")
    private Long trendAdxNeg;
    @NotNull
    @Column(name = "trend_vortex_ind_pos")
    private Long trendVortexIndPos;
    @NotNull
    @Column(name = "trend_vortex_ind_neg")
    private Long trendVortexIndNeg;
    @NotNull
    @Column(name = "trend_vortex_diff")
    private Long trendVortexDiff;
    @NotNull
    @Column(name = "trend_trix")
    private Long trendTrix;
    @NotNull
    @Column(name = "trend_mass_index")
    private Long trendMassIndex;
    @NotNull
    @Column(name = "trend_cci")
    private Long trendCci;
    @NotNull
    @Column(name = "trend_dpo")
    private Long trendDpo;
    @NotNull
    @Column(name = "trend_kst")
    private Long trendKst;
    @NotNull
    @Column(name = "trend_kst_sig")
    private Long trendKstSig;
    @NotNull
    @Column(name = "trend_kst_diff")
    private Long trendKstDiff;
    @NotNull
    @Column(name = "trend_ichimoku_a")
    private Long trendIchimokuA;
    @NotNull
    @Column(name = "trend_ichimoku_b")
    private Long trendIchimokuB;
    @NotNull
    @Column(name = "trend_visual_ichimoku_a")
    private Long trendVisualIchimokuA;
    @NotNull
    @Column(name = "trend_visual_ichimoku_b")
    private Long trendVisualIchimokuB;
    @NotNull
    @Column(name = "trend_aroon_up")
    private Long trendAroonUp;
    @NotNull
    @Column(name = "trend_aroon_down")
    private Long trendAroonDown;
    @NotNull
    @Column(name = "trend_aroon_ind")
    private Long trendAroonInd;
    @NotNull
    @Column(name = "volatility_atr")
    private Long volatilityAtr;
    @NotNull
    @Column(name = "volatility_bbh")
    private Long volatilityBbh;
    @NotNull
    @Column(name = "volatility_bbl")
    private Long volatilityBbl;
    @NotNull
    @Column(name = "volatility_bbm")
    private Long volatilityBbm;
    @NotNull
    @Column(name = "volatility_bbhi")
    private Long volatilityBbhi;
    @NotNull
    @Column(name = "volatility_bbli")
    private Long volatilityBbli;
    @NotNull
    @Column(name = "volatility_kcc")
    private Long volatilityKcc;
    @NotNull
    @Column(name = "volatility_kch")
    private Long volatilityKch;
    @NotNull
    @Column(name = "volatility_kcl")
    private Long volatilityKcl;
    @NotNull
    @Column(name = "volatility_kchi")
    private Long volatilityKchi;
    @NotNull
    @Column(name = "volatility_kcli")
    private Long volatilityKcli;
    @NotNull
    @Column(name = "volatility_dch")
    private Long volatilityDch;
    @NotNull
    @Column(name = "volatility_dcl")
    private Long volatilityDcl;
    @NotNull
    @Column(name = "volatility_dchi")
    private Long volatilityDchi;
    @NotNull
    @Column(name = "volatility_dcli")
    private Long volatilityDcli;
    @NotNull
    @Column(name = "others_dr")
    private Long othersDr;
    @NotNull
    @Column(name = "others_dlr")
    private Long othersDlr;
    @NotNull
    @Column(name = "others_cr")
    private Long othersCr;
    @NotNull
    @Column(name = "ema_5")
    private Long ema5;
    @NotNull
    @Column(name = "ema_8")
    private Long ema8;
    @NotNull
    @Column(name = "ema_9")
    private Long ema9;
    @NotNull
    @Column(name = "ema_13")
    private Long ema13;
    @NotNull
    @Column(name = "ema_21")
    private Long ema21;
    @NotNull
    @Column(name = "ema_34")
    private Long ema34;
    @NotNull
    @Column(name = "ema_50")
    private Long ema50;
    @NotNull
    @Column(name = "ema_100")
    private Long ema100;
    @NotNull
    @Column(name = "ema_200")
    private Long ema200;
    @NotNull
    @Column(name = "ema_240")
    private Long ema240;
    @NotNull
    @Column(name = "sma_5")
    private Long sma5;
    @NotNull
    @Column(name = "sma_10")
    private Long sma10;
    @NotNull
    @Column(name = "sma_20")
    private Long sma20;
    @NotNull
    @Column(name = "sma_50")
    private Long sma50;
    @NotNull
    @Column(name = "sma_100")
    private Long sma100;
    @NotNull
    @Column(name = "sma_200")
    private Long sma200;
    @NotNull
    @Column(name = "sma_240")
    private Long sma240;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getOpen() {
        return open;
    }

    public void setOpen(Long open) {
        this.open = open;
    }

    public Long getClose() {
        return close;
    }

    public void setClose(Long close) {
        this.close = close;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getLow() {
        return low;
    }

    public void setLow(Long low) {
        this.low = low;
    }

    public Long getVolumeAdi() {
        return volumeAdi;
    }

    public void setVolumeAdi(Long volumeAdi) {
        this.volumeAdi = volumeAdi;
    }

    public Long getVolumeObv() {
        return volumeObv;
    }

    public void setVolumeObv(Long volumeObv) {
        this.volumeObv = volumeObv;
    }

    public Long getVolumeCmf() {
        return volumeCmf;
    }

    public void setVolumeCmf(Long volumeCmf) {
        this.volumeCmf = volumeCmf;
    }

    public Long getVolumeFi() {
        return volumeFi;
    }

    public void setVolumeFi(Long volumeFi) {
        this.volumeFi = volumeFi;
    }

    public Long getVolumeEm() {
        return volumeEm;
    }

    public void setVolumeEm(Long volumeEm) {
        this.volumeEm = volumeEm;
    }

    public Long getVolumeVpt() {
        return volumeVpt;
    }

    public void setVolumeVpt(Long volumeVpt) {
        this.volumeVpt = volumeVpt;
    }

    public Long getVolumeNvi() {
        return volumeNvi;
    }

    public void setVolumeNvi(Long volumeNvi) {
        this.volumeNvi = volumeNvi;
    }

    public Long getMomentumRsi() {
        return momentumRsi;
    }

    public void setMomentumRsi(Long momentumRsi) {
        this.momentumRsi = momentumRsi;
    }

    public Long getMomentumMfi() {
        return momentumMfi;
    }

    public void setMomentumMfi(Long momentumMfi) {
        this.momentumMfi = momentumMfi;
    }

    public Long getMomentumTsi() {
        return momentumTsi;
    }

    public void setMomentumTsi(Long momentumTsi) {
        this.momentumTsi = momentumTsi;
    }

    public Long getMomentumUo() {
        return momentumUo;
    }

    public void setMomentumUo(Long momentumUo) {
        this.momentumUo = momentumUo;
    }

    public Long getMomentumStoch() {
        return momentumStoch;
    }

    public void setMomentumStoch(Long momentumStoch) {
        this.momentumStoch = momentumStoch;
    }

    public Long getMomentumStochSignal() {
        return momentumStochSignal;
    }

    public void setMomentumStochSignal(Long momentumStochSignal) {
        this.momentumStochSignal = momentumStochSignal;
    }

    public Long getMomentumWr() {
        return momentumWr;
    }

    public void setMomentumWr(Long momentumWr) {
        this.momentumWr = momentumWr;
    }

    public Long getMomentumAo() {
        return momentumAo;
    }

    public void setMomentumAo(Long momentumAo) {
        this.momentumAo = momentumAo;
    }

    public Long getMomentumKama() {
        return momentumKama;
    }

    public void setMomentumKama(Long momentumKama) {
        this.momentumKama = momentumKama;
    }

    public Long getTrendMacd() {
        return trendMacd;
    }

    public void setTrendMacd(Long trendMacd) {
        this.trendMacd = trendMacd;
    }

    public Long getTrendMacdSignal() {
        return trendMacdSignal;
    }

    public void setTrendMacdSignal(Long trendMacdSignal) {
        this.trendMacdSignal = trendMacdSignal;
    }

    public Long getTrendMacdDiff() {
        return trendMacdDiff;
    }

    public void setTrendMacdDiff(Long trendMacdDiff) {
        this.trendMacdDiff = trendMacdDiff;
    }

    public Long getTrendEmaFast() {
        return trendEmaFast;
    }

    public void setTrendEmaFast(Long trendEmaFast) {
        this.trendEmaFast = trendEmaFast;
    }

    public Long getTrendEmaSlow() {
        return trendEmaSlow;
    }

    public void setTrendEmaSlow(Long trendEmaSlow) {
        this.trendEmaSlow = trendEmaSlow;
    }

    public Long getTrendAdx() {
        return trendAdx;
    }

    public void setTrendAdx(Long trendAdx) {
        this.trendAdx = trendAdx;
    }

    public Long getTrendAdxPos() {
        return trendAdxPos;
    }

    public void setTrendAdxPos(Long trendAdxPos) {
        this.trendAdxPos = trendAdxPos;
    }

    public Long getTrendAdxNeg() {
        return trendAdxNeg;
    }

    public void setTrendAdxNeg(Long trendAdxNeg) {
        this.trendAdxNeg = trendAdxNeg;
    }

    public Long getTrendVortexIndPos() {
        return trendVortexIndPos;
    }

    public void setTrendVortexIndPos(Long trendVortexIndPos) {
        this.trendVortexIndPos = trendVortexIndPos;
    }

    public Long getTrendVortexIndNeg() {
        return trendVortexIndNeg;
    }

    public void setTrendVortexIndNeg(Long trendVortexIndNeg) {
        this.trendVortexIndNeg = trendVortexIndNeg;
    }

    public Long getTrendVortexDiff() {
        return trendVortexDiff;
    }

    public void setTrendVortexDiff(Long trendVortexDiff) {
        this.trendVortexDiff = trendVortexDiff;
    }

    public Long getTrendTrix() {
        return trendTrix;
    }

    public void setTrendTrix(Long trendTrix) {
        this.trendTrix = trendTrix;
    }

    public Long getTrendMassIndex() {
        return trendMassIndex;
    }

    public void setTrendMassIndex(Long trendMassIndex) {
        this.trendMassIndex = trendMassIndex;
    }

    public Long getTrendCci() {
        return trendCci;
    }

    public void setTrendCci(Long trendCci) {
        this.trendCci = trendCci;
    }

    public Long getTrendDpo() {
        return trendDpo;
    }

    public void setTrendDpo(Long trendDpo) {
        this.trendDpo = trendDpo;
    }

    public Long getTrendKst() {
        return trendKst;
    }

    public void setTrendKst(Long trendKst) {
        this.trendKst = trendKst;
    }

    public Long getTrendKstSig() {
        return trendKstSig;
    }

    public void setTrendKstSig(Long trendKstSig) {
        this.trendKstSig = trendKstSig;
    }

    public Long getTrendKstDiff() {
        return trendKstDiff;
    }

    public void setTrendKstDiff(Long trendKstDiff) {
        this.trendKstDiff = trendKstDiff;
    }

    public Long getTrendIchimokuA() {
        return trendIchimokuA;
    }

    public void setTrendIchimokuA(Long trendIchimokuA) {
        this.trendIchimokuA = trendIchimokuA;
    }

    public Long getTrendIchimokuB() {
        return trendIchimokuB;
    }

    public void setTrendIchimokuB(Long trendIchimokuB) {
        this.trendIchimokuB = trendIchimokuB;
    }

    public Long getTrendVisualIchimokuA() {
        return trendVisualIchimokuA;
    }

    public void setTrendVisualIchimokuA(Long trendVisualIchimokuA) {
        this.trendVisualIchimokuA = trendVisualIchimokuA;
    }

    public Long getTrendVisualIchimokuB() {
        return trendVisualIchimokuB;
    }

    public void setTrendVisualIchimokuB(Long trendVisualIchimokuB) {
        this.trendVisualIchimokuB = trendVisualIchimokuB;
    }

    public Long getTrendAroonUp() {
        return trendAroonUp;
    }

    public void setTrendAroonUp(Long trendAroonUp) {
        this.trendAroonUp = trendAroonUp;
    }

    public Long getTrendAroonDown() {
        return trendAroonDown;
    }

    public void setTrendAroonDown(Long trendAroonDown) {
        this.trendAroonDown = trendAroonDown;
    }

    public Long getTrendAroonInd() {
        return trendAroonInd;
    }

    public void setTrendAroonInd(Long trendAroonInd) {
        this.trendAroonInd = trendAroonInd;
    }

    public Long getVolatilityAtr() {
        return volatilityAtr;
    }

    public void setVolatilityAtr(Long volatilityAtr) {
        this.volatilityAtr = volatilityAtr;
    }

    public Long getVolatilityBbh() {
        return volatilityBbh;
    }

    public void setVolatilityBbh(Long volatilityBbh) {
        this.volatilityBbh = volatilityBbh;
    }

    public Long getVolatilityBbl() {
        return volatilityBbl;
    }

    public void setVolatilityBbl(Long volatilityBbl) {
        this.volatilityBbl = volatilityBbl;
    }

    public Long getVolatilityBbm() {
        return volatilityBbm;
    }

    public void setVolatilityBbm(Long volatilityBbm) {
        this.volatilityBbm = volatilityBbm;
    }

    public Long getVolatilityBbhi() {
        return volatilityBbhi;
    }

    public void setVolatilityBbhi(Long volatilityBbhi) {
        this.volatilityBbhi = volatilityBbhi;
    }

    public Long getVolatilityBbli() {
        return volatilityBbli;
    }

    public void setVolatilityBbli(Long volatilityBbli) {
        this.volatilityBbli = volatilityBbli;
    }

    public Long getVolatilityKcc() {
        return volatilityKcc;
    }


    public void setVolatilityKcc(Long volatilityKcc) {
        this.volatilityKcc = volatilityKcc;
    }

    public Long getVolatilityKch() {
        return volatilityKch;
    }

    public void setVolatilityKch(Long volatilityKch) {
        this.volatilityKch = volatilityKch;
    }

    public Long getVolatilityKcl() {
        return volatilityKcl;
    }

    public void setVolatilityKcl(Long volatilityKcl) {
        this.volatilityKcl = volatilityKcl;
    }

    public Long getVolatilityKchi() {
        return volatilityKchi;
    }

    public void setVolatilityKchi(Long volatilityKchi) {
        this.volatilityKchi = volatilityKchi;
    }

    public Long getVolatilityKcli() {
        return volatilityKcli;
    }

    public void setVolatilityKcli(Long volatilityKcli) {
        this.volatilityKcli = volatilityKcli;
    }

    public Long getVolatilityDch() {
        return volatilityDch;
    }

    public void setVolatilityDch(Long volatilityDch) {
        this.volatilityDch = volatilityDch;
    }

    public Long getVolatilityDcl() {
        return volatilityDcl;
    }

    public void setVolatilityDcl(Long volatilityDcl) {
        this.volatilityDcl = volatilityDcl;
    }

    public Long getVolatilityDchi() {
        return volatilityDchi;
    }

    public void setVolatilityDchi(Long volatilityDchi) {
        this.volatilityDchi = volatilityDchi;
    }

    public Long getVolatilityDcli() {
        return volatilityDcli;
    }

    public void setVolatilityDcli(Long volatilityDcli) {
        this.volatilityDcli = volatilityDcli;
    }

    public Long getOthersDr() {
        return othersDr;
    }

    public void setOthersDr(Long othersDr) {
        this.othersDr = othersDr;
    }

    public Long getOthersDlr() {
        return othersDlr;
    }

    public void setOthersDlr(Long othersDlr) {
        this.othersDlr = othersDlr;
    }

    public Long getOthersCr() {
        return othersCr;
    }

    public void setOthersCr(Long othersCr) {
        this.othersCr = othersCr;
    }

    public Long getEma5() {
        return ema5;
    }

    public void setEma5(Long ema5) {
        this.ema5 = ema5;
    }

    public Long getEma8() {
        return ema8;
    }

    public void setEma8(Long ema8) {
        this.ema8 = ema8;
    }

    public Long getEma9() {
        return ema9;
    }

    public void setEma9(Long ema9) {
        this.ema9 = ema9;
    }

    public Long getEma13() {
        return ema13;
    }

    public void setEma13(Long ema13) {
        this.ema13 = ema13;
    }

    public Long getEma21() {
        return ema21;
    }

    public void setEma21(Long ema21) {
        this.ema21 = ema21;
    }

    public Long getEma34() {
        return ema34;
    }

    public void setEma34(Long ema34) {
        this.ema34 = ema34;
    }

    public Long getEma50() {
        return ema50;
    }

    public void setEma50(Long ema50) {
        this.ema50 = ema50;
    }

    public Long getEma100() {
        return ema100;
    }

    public void setEma100(Long ema100) {
        this.ema100 = ema100;
    }

    public Long getEma200() {
        return ema200;
    }

    public void setEma200(Long ema200) {
        this.ema200 = ema200;
    }

    public Long getEma240() {
        return ema240;
    }

    public void setEma240(Long ema240) {
        this.ema240 = ema240;
    }

    public Long getSma5() {
        return sma5;
    }

    public void setSma5(Long sma5) {
        this.sma5 = sma5;
    }

    public Long getSma10() {
        return sma10;
    }

    public void setSma10(Long sma10) {
        this.sma10 = sma10;
    }

    public Long getSma20() {
        return sma20;
    }

    public void setSma20(Long sma20) {
        this.sma20 = sma20;
    }

    public Long getSma50() {
        return sma50;
    }

    public void setSma50(Long sma50) {
        this.sma50 = sma50;
    }

    public Long getSma100() {
        return sma100;
    }

    public void setSma100(Long sma100) {
        this.sma100 = sma100;
    }

    public Long getSma200() {
        return sma200;
    }

    public void setSma200(Long sma200) {
        this.sma200 = sma200;
    }

    public Long getSma240() {
        return sma240;
    }

    public void setSma240(Long sma240) {
        this.sma240 = sma240;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol = (Symbol) o;
        return Objects.equals(id, symbol.id) &&
            Objects.equals(name, symbol.name) &&
            Objects.equals(volume, symbol.volume) &&
            Objects.equals(transactionDate, symbol.transactionDate) &&
            Objects.equals(open, symbol.open) &&
            Objects.equals(close, symbol.close) &&
            Objects.equals(high, symbol.high) &&
            Objects.equals(low, symbol.low) &&
            Objects.equals(volumeAdi, symbol.volumeAdi) &&
            Objects.equals(volumeObv, symbol.volumeObv) &&
            Objects.equals(volumeCmf, symbol.volumeCmf) &&
            Objects.equals(volumeFi, symbol.volumeFi) &&
            Objects.equals(volumeEm, symbol.volumeEm) &&
            Objects.equals(volumeVpt, symbol.volumeVpt) &&
            Objects.equals(volumeNvi, symbol.volumeNvi) &&
            Objects.equals(momentumRsi, symbol.momentumRsi) &&
            Objects.equals(momentumMfi, symbol.momentumMfi) &&
            Objects.equals(momentumTsi, symbol.momentumTsi) &&
            Objects.equals(momentumUo, symbol.momentumUo) &&
            Objects.equals(momentumStoch, symbol.momentumStoch) &&
            Objects.equals(momentumStochSignal, symbol.momentumStochSignal) &&
            Objects.equals(momentumWr, symbol.momentumWr) &&
            Objects.equals(momentumAo, symbol.momentumAo) &&
            Objects.equals(momentumKama, symbol.momentumKama) &&
            Objects.equals(trendMacd, symbol.trendMacd) &&
            Objects.equals(trendMacdSignal, symbol.trendMacdSignal) &&
            Objects.equals(trendMacdDiff, symbol.trendMacdDiff) &&
            Objects.equals(trendEmaFast, symbol.trendEmaFast) &&
            Objects.equals(trendEmaSlow, symbol.trendEmaSlow) &&
            Objects.equals(trendAdx, symbol.trendAdx) &&
            Objects.equals(trendAdxPos, symbol.trendAdxPos) &&
            Objects.equals(trendAdxNeg, symbol.trendAdxNeg) &&
            Objects.equals(trendVortexIndPos, symbol.trendVortexIndPos) &&
            Objects.equals(trendVortexIndNeg, symbol.trendVortexIndNeg) &&
            Objects.equals(trendVortexDiff, symbol.trendVortexDiff) &&
            Objects.equals(trendTrix, symbol.trendTrix) &&
            Objects.equals(trendMassIndex, symbol.trendMassIndex) &&
            Objects.equals(trendCci, symbol.trendCci) &&
            Objects.equals(trendDpo, symbol.trendDpo) &&
            Objects.equals(trendKst, symbol.trendKst) &&
            Objects.equals(trendKstSig, symbol.trendKstSig) &&
            Objects.equals(trendKstDiff, symbol.trendKstDiff) &&
            Objects.equals(trendIchimokuA, symbol.trendIchimokuA) &&
            Objects.equals(trendIchimokuB, symbol.trendIchimokuB) &&
            Objects.equals(trendVisualIchimokuA, symbol.trendVisualIchimokuA) &&
            Objects.equals(trendVisualIchimokuB, symbol.trendVisualIchimokuB) &&
            Objects.equals(trendAroonUp, symbol.trendAroonUp) &&
            Objects.equals(trendAroonDown, symbol.trendAroonDown) &&
            Objects.equals(trendAroonInd, symbol.trendAroonInd) &&
            Objects.equals(volatilityAtr, symbol.volatilityAtr) &&
            Objects.equals(volatilityBbh, symbol.volatilityBbh) &&
            Objects.equals(volatilityBbl, symbol.volatilityBbl) &&
            Objects.equals(volatilityBbm, symbol.volatilityBbm) &&
            Objects.equals(volatilityBbhi, symbol.volatilityBbhi) &&
            Objects.equals(volatilityBbli, symbol.volatilityBbli) &&
            Objects.equals(volatilityKcc, symbol.volatilityKcc) &&
            Objects.equals(volatilityKch, symbol.volatilityKch) &&
            Objects.equals(volatilityKcl, symbol.volatilityKcl) &&
            Objects.equals(volatilityKchi, symbol.volatilityKchi) &&
            Objects.equals(volatilityKcli, symbol.volatilityKcli) &&
            Objects.equals(volatilityDch, symbol.volatilityDch) &&
            Objects.equals(volatilityDcl, symbol.volatilityDcl) &&
            Objects.equals(volatilityDchi, symbol.volatilityDchi) &&
            Objects.equals(volatilityDcli, symbol.volatilityDcli) &&
            Objects.equals(othersDr, symbol.othersDr) &&
            Objects.equals(othersDlr, symbol.othersDlr) &&
            Objects.equals(othersCr, symbol.othersCr) &&
            Objects.equals(ema5, symbol.ema5) &&
            Objects.equals(ema8, symbol.ema8) &&
            Objects.equals(ema9, symbol.ema9) &&
            Objects.equals(ema13, symbol.ema13) &&
            Objects.equals(ema21, symbol.ema21) &&
            Objects.equals(ema34, symbol.ema34) &&
            Objects.equals(ema50, symbol.ema50) &&
            Objects.equals(ema100, symbol.ema100) &&
            Objects.equals(ema200, symbol.ema200) &&
            Objects.equals(ema240, symbol.ema240) &&
            Objects.equals(sma5, symbol.sma5) &&
            Objects.equals(sma10, symbol.sma10) &&
            Objects.equals(sma20, symbol.sma20) &&
            Objects.equals(sma50, symbol.sma50) &&
            Objects.equals(sma100, symbol.sma100) &&
            Objects.equals(sma200, symbol.sma200) &&
            Objects.equals(sma240, symbol.sma240);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, volume, transactionDate, open, close, high, low, volumeAdi, volumeObv, volumeCmf, volumeFi, volumeEm, volumeVpt, volumeNvi, momentumRsi, momentumMfi, momentumTsi, momentumUo, momentumStoch, momentumStochSignal, momentumWr, momentumAo, momentumKama, trendMacd, trendMacdSignal, trendMacdDiff, trendEmaFast, trendEmaSlow, trendAdx, trendAdxPos, trendAdxNeg, trendVortexIndPos, trendVortexIndNeg, trendVortexDiff, trendTrix, trendMassIndex, trendCci, trendDpo, trendKst, trendKstSig, trendKstDiff, trendIchimokuA, trendIchimokuB, trendVisualIchimokuA, trendVisualIchimokuB, trendAroonUp, trendAroonDown, trendAroonInd, volatilityAtr, volatilityBbh, volatilityBbl, volatilityBbm, volatilityBbhi, volatilityBbli, volatilityKcc, volatilityKch, volatilityKcl, volatilityKchi, volatilityKcli, volatilityDch, volatilityDcl, volatilityDchi, volatilityDcli, othersDr, othersDlr, othersCr, ema5, ema8, ema9, ema13, ema21, ema34, ema50, ema100, ema200, ema240, sma5, sma10, sma20, sma50, sma100, sma200, sma240);
    }

    @Override
    public String toString() {
        return "Symbol{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", volume=" + volume +
            ", transactionDate=" + transactionDate +
            ", open=" + open +
            ", close=" + close +
            ", high=" + high +
            ", low=" + low +
            ", volumeAdi=" + volumeAdi +
            ", volumeObv=" + volumeObv +
            ", volumeCmf=" + volumeCmf +
            ", volumeFi=" + volumeFi +
            ", volumeEm=" + volumeEm +
            ", volumeVpt=" + volumeVpt +
            ", volumeNvi=" + volumeNvi +
            ", momentumRsi=" + momentumRsi +
            ", momentumMfi=" + momentumMfi +
            ", momentumTsi=" + momentumTsi +
            ", momentumUo=" + momentumUo +
            ", momentumStoch=" + momentumStoch +
            ", momentumStochSignal=" + momentumStochSignal +
            ", momentumWr=" + momentumWr +
            ", momentumAo=" + momentumAo +
            ", momentumKama=" + momentumKama +
            ", trendMacd=" + trendMacd +
            ", trendMacdSignal=" + trendMacdSignal +
            ", trendMacdDiff=" + trendMacdDiff +
            ", trendEmaFast=" + trendEmaFast +
            ", trendEmaSlow=" + trendEmaSlow +
            ", trendAdx=" + trendAdx +
            ", trendAdxPos=" + trendAdxPos +
            ", trendAdxNeg=" + trendAdxNeg +
            ", trendVortexIndPos=" + trendVortexIndPos +
            ", trendVortexIndNeg=" + trendVortexIndNeg +
            ", trendVortexDiff=" + trendVortexDiff +
            ", trendTrix=" + trendTrix +
            ", trendMassIndex=" + trendMassIndex +
            ", trendCci=" + trendCci +
            ", trendDpo=" + trendDpo +
            ", trendKst=" + trendKst +
            ", trendKstSig=" + trendKstSig +
            ", trendKstDiff=" + trendKstDiff +
            ", trendIchimokuA=" + trendIchimokuA +
            ", trendIchimokuB=" + trendIchimokuB +
            ", trendVisualIchimokuA=" + trendVisualIchimokuA +
            ", trendVisualIchimokuB=" + trendVisualIchimokuB +
            ", trendAroonUp=" + trendAroonUp +
            ", trendAroonDown=" + trendAroonDown +
            ", trendAroonInd=" + trendAroonInd +
            ", volatilityAtr=" + volatilityAtr +
            ", volatilityBbh=" + volatilityBbh +
            ", volatilityBbl=" + volatilityBbl +
            ", volatilityBbm=" + volatilityBbm +
            ", volatilityBbhi=" + volatilityBbhi +
            ", volatilityBbli=" + volatilityBbli +
            ", volatilityKcc=" + volatilityKcc +
            ", volatilityKch=" + volatilityKch +
            ", volatilityKcl=" + volatilityKcl +
            ", volatilityKchi=" + volatilityKchi +
            ", volatilityKcli=" + volatilityKcli +
            ", volatilityDch=" + volatilityDch +
            ", volatilityDcl=" + volatilityDcl +
            ", volatilityDchi=" + volatilityDchi +
            ", volatilityDcli=" + volatilityDcli +
            ", othersDr=" + othersDr +
            ", othersDlr=" + othersDlr +
            ", othersCr=" + othersCr +
            ", ema5=" + ema5 +
            ", ema8=" + ema8 +
            ", ema9=" + ema9 +
            ", ema13=" + ema13 +
            ", ema21=" + ema21 +
            ", ema34=" + ema34 +
            ", ema50=" + ema50 +
            ", ema100=" + ema100 +
            ", ema200=" + ema200 +
            ", ema240=" + ema240 +
            ", sma5=" + sma5 +
            ", sma10=" + sma10 +
            ", sma20=" + sma20 +
            ", sma50=" + sma50 +
            ", sma100=" + sma100 +
            ", sma200=" + sma200 +
            ", sma240=" + sma240 +
            '}';
    }


}
