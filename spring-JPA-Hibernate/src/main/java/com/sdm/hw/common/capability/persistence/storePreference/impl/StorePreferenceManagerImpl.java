package com.sdm.hw.common.capability.persistence.storePreference.impl;

import com.sdm.hw.common.capability.persistence.dao.StorePreferenceDAO;
import com.sdm.hw.common.capability.persistence.entity.StorePreference;
import com.sdm.hw.common.capability.persistence.storePreference.StorePreferenceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorePreferenceManagerImpl implements StorePreferenceManager {

    @Autowired
    private StorePreferenceDAO storePreferenceDAO;

    @Override
    public List<StorePreference> findAll() throws Exception{
        return storePreferenceDAO.findAll();
    }

    @Override
    public StorePreference findByCDSP(String CDSP) throws Exception{
        return storePreferenceDAO.findByCDSP(CDSP);
    }
}
