package org.rebootu.bborg.models.util;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Brett on 6/19/2015.
 */
@Embeddable
public class MarketSymbolDate implements Serializable {

    private String marketSymbol;
    private Date marketDate;

    private MarketSymbolDate() {}

    public MarketSymbolDate(String marketSymbol, Date marketDate) {
        this.marketSymbol = marketSymbol;
        this.marketDate = marketDate;
    }

    public String getMarketSymbol() {
        return marketSymbol;
    }

    private void setMarketSymbol(String marketSymbol) {
        this.marketSymbol = marketSymbol;
    }

    public Date getMarketDate() {
        return marketDate;
    }

    private void setMarketDate(Date marketDate) {
        this.marketDate = marketDate;
    }

}
