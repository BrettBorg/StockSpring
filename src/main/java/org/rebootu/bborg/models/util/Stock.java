package org.rebootu.bborg.models.util;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Brett on 6/17/2015.
 */
@Entity
@Table(name = "stock")
@IdClass(StockSymbolDate.class)
public class Stock extends AbstractEntity {

    Stock(StockSymbolDate stockSymbolDate) {
	stockSymbol = stockSymbolDate.getStockSymbol();
	stockDate = stockSymbolDate.getStockDate();
	}

    @Id
	@AttributeOverrides({
	@AttributeOverride(name = "stockSymbol",
	column = @Column(name="stock_symbol")),
	@AttributeOverride(name = "stockDate",
	column = @Column(name="stock_date"))
	})

    private String stockSymbol;
    private Date stockDate;
    private double stockOpen;
    private double stockClose;
    private double stockGainLoss;

    private Stock() {}

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
