package org.rebootu.bborg.models.dao;

import org.rebootu.bborg.models.util.Market;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Brett on 6/17/2015.
 */
@Transactional
@Repository
public interface MarketDao extends CrudRepository<Market, Integer> {

    Market findByMarketSymbol(String symbol);

}
