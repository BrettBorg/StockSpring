package org.rebootu.bborg.models.util;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Brett on 6/17/2015.
 */
@Entity
@Table(name = "temperature")
@IdClass(TemperatureZipcodeDate.class)
public class Temperature extends AbstractEntity {

    Temperature(TemperatureZipcodeDate temperatureZipcodeDate) {
	temperatureZipcode = temperatureZipcodeDate.getTemperatureZipcode();
	temperatureDate = temperatureZipcodeDate.getTemperatureDate();
	}

    @Id
	@AttributeOverrides({
	@AttributeOverride(name = "temperatureZipcode",
	column = @Column(name="zipcode")),
	@AttributeOverride(name = "temperatureDate",
	column = @Column(name="temp_date"))
	})

    private String temperatureZipcode;
    private Date temperatureDate;
    private int highTemp;

    private Temperature() {}

    @NotNull
    @Column(name = "high_temp", nullable = false)
    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTempOpen) {
        this.highTemp = highTempOpen;
    }

    private Temperature(String temperatureZipcode, Date temperatureDate, int highTemp) {
        this.temperatureZipcode = temperatureZipcode;
        this.temperatureDate = temperatureDate;
        this.highTemp = highTemp;
    }

}
