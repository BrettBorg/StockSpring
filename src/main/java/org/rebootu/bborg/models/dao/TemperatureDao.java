package org.rebootu.bborg.models.dao;

import org.rebootu.bborg.models.util.Temperature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Brett on 6/17/2015.
 */
@Transactional
@Repository
public interface TemperatureDao extends CrudRepository<Temperature, Integer> {

    Temperature findByTemperatureZipcode(String zipcode);

}