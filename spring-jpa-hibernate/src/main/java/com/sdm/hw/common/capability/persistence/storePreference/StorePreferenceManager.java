package com.sdm.hw.common.capability.persistence.storePreference;

import com.sdm.hw.common.capability.persistence.entity.StorePreference;

import java.util.List;

public interface StorePreferenceManager {
    List<StorePreference> findAll() throws Exception;
    StorePreference findByCDSP(String CDSP) throws Exception;
}
