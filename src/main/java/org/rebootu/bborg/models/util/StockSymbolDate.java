package org.rebootu.bborg.models.util;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Brett on 6/20/2015.
 */
@Embeddable
public class StockSymbolDate implements Serializable {

    private String stockSymbol;
    private Date stockDate;

    private StockSymbolDate() {}

    public StockSymbolDate(String stockSymbol, Date stockDate) {
        this.stockSymbol = stockSymbol;
        this.stockDate = stockDate;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    private void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public Date getStockDate() {
        return stockDate;
    }

    private void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }

}
