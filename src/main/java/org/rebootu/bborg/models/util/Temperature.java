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
@Table(name = "temperature")
public class Temperature extends AbstractEntity {

    private String zipcode;
    private Date tempDate;
    private int highTemp;

    private Temperature() {}

    @NotNull
    @Column(name = "zipcode", nullable = false)
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @NotNull
    @Column(name = "temp_date", nullable = false)
    public Date getTempDate() {
        return tempDate;
    }

    public void setTempDate(Date tempDate) {
        this.tempDate = tempDate;
    }

    @NotNull
    @Column(name = "high_temp", nullable = false)
    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTempOpen) {
        this.highTemp = highTempOpen;
    }

    private Temperature(String zipcode, Date tempDate, int highTemp) {
        this.zipcode = zipcode;
        this.tempDate = tempDate;
        this.highTemp = highTemp;
    }

}
