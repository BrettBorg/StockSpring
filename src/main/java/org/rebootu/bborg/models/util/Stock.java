package org.rebootu.bborg.models.util;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Brett on 6/17/2015.
 */
@Entity
@Table(name = "stock")
public class Stock extends AbstractEntity {

    private String stockSymbol;
    private Date stockDate;
    private double stockOpen;
    private double stockClose;
    private double stockGainLoss;

    private Stock() {}

    @NotNull
    @Column(name = "stock_symbol", nullable = false)
    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    @NotNull
    @Column(name = "stock_date", nullable = false)
    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }

    @NotNull
    @Column(name = "stock_open", nullable = false)
    public double getStockOpen() {
        return stockOpen;
    }

    public void setStockOpen(double stockOpen) {
        this.stockOpen = stockOpen;
    }

    @NotNull
    @Column(name = "stock_close", nullable = false)
    public double getStockClose() {
        return stockClose;
    }

    public void setStockClose(double stockClose) {
        this.stockClose = stockClose;
    }

    @NotNull
    @Column(name = "stock_gain_loss", nullable = false)
    public double getStockGainLoss() {
        return stockGainLoss;
    }

    public void setStockGainLoss(double stockGainLoss) {
        this.stockGainLoss = stockGainLoss;
    }

    private Stock(String stockSymbol, Date stockDate, double stockOpen, double stockClose, double stockGainLoss) {
        this.stockSymbol = stockSymbol.toUpperCase();
        this.stockDate = stockDate;
        this.stockOpen = stockOpen;
        this.stockClose = stockClose;
        this.stockGainLoss = stockGainLoss;
    }

}
