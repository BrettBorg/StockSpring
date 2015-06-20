package org.rebootu.bborg.models.util;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Brett on 6/20/2015.
 */
@Embeddable
public class TemperatureZipcodeDate implements Serializable {

    private String temperatureZipcode;
    private Date temperatureDate;

    private TemperatureZipcodeDate() {}

    public TemperatureZipcodeDate(String temperatureZipcode, Date temperatureDate) {
        this.temperatureZipcode = temperatureZipcode;
        this.temperatureDate = temperatureDate;
    }

    public String getTemperatureZipcode() {
        return temperatureZipcode;
    }

    private void setTemperatureZipcode(String temperatureZipcode) {
        this.temperatureZipcode = temperatureZipcode;
    }

    public Date getTemperatureDate() {
        return temperatureDate;
    }

    private void setTemperatureDate(Date temperatureDate) {
        this.temperatureDate = temperatureDate;
    }

}
