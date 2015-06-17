package org.rebootu.bborg.models.util;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Brett on 6/12/2015.
 */
@Entity
@Table(name = "market")
public class Market extends AbstractEntity {

    private String marketSymbol;
    private Date marketDate;
    private int marketOpen;
    private int marketClose;
    private int marketGainLoss;

    private Market() {}

    @NotNull
    @Column(name = "market_symbol", nullable = false)
    public String getMarketSymbol() {
        return marketSymbol;
    }

    public void setMarketSymbol(String marketSymbol) {
        this.marketSymbol = marketSymbol;
    }

    @NotNull
    @Column(name = "market_date", nullable = false)
    public Date getMarketDate() {
        return marketDate;
    }

    public void setMarketDate(Date marketDate) {
        this.marketDate = marketDate;
    }

    @NotNull
    @Column(name = "market_open", nullable = false)
    public int getMarketOpen() {
        return marketOpen;
    }

    public void setMarketOpen(int marketOpen) {
        this.marketOpen = marketOpen;
    }

    @NotNull
    @Column(name = "market_close", nullable = false)
    public int getMarketClose() {
        return marketClose;
    }

    public void setMarketClose(int marketClose) {
        this.marketClose = marketClose;
    }

    @NotNull
    @Column(name = "market_gain_loss", nullable = false)
    public int getMarketGainLoss() {
        return marketGainLoss;
    }

    public void setMarketGainLoss(int marketGainLoss) {
        this.marketGainLoss = marketGainLoss;
    }

    private Market(String marketSymbol, Date marketDate, int marketOpen, int marketClose, int marketGainLoss) {
        this.marketSymbol = marketSymbol.toUpperCase();
        this.marketDate = marketDate;
        this.marketOpen = marketOpen;
        this.marketClose = marketClose;
        this.marketGainLoss = marketGainLoss;
    }



}
