package com.sdm.hw.common.capability;

import com.sdm.hw.common.capability.persistence.entity.StorePreference;
import com.sdm.hw.common.capability.persistence.storePreference.StorePreferenceManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides the current province
 */
public final class ProvinceCodeProvider {

    private static final ProvinceCodeProvider provinceCodeProvider = new ProvinceCodeProvider();

    private ProvinceCode provinceCode = ProvinceCode.NOVA_SCOTIA;

    /**
     * Private constructor implementing singleton
     */
    private ProvinceCodeProvider() {
    }

    public static ProvinceCodeProvider getInstance() {
        return provinceCodeProvider;
    }

    /**
     * @return provinceCode for the current province
     */
    ProvinceCode getCurrentProvinceCode() {

        //TODO: Note for 17.1 team...please implement logic to read current province from
        //TODO: "STORE_PREFERENCE" table and the corresponding provincial code.
        return provinceCode;
    }

    void setCurrentProvinceCode(ProvinceCode provinceCode){
        this.provinceCode = provinceCode;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        StorePreferenceManager storePreferenceManager =
                context.getBean("storePreferenceManager", StorePreferenceManager.class);

        try {
            System.out.println(">> Printing Province ID");
//            List<StorePreference> storePreferences = storePreferenceManager.findAll();
//            printStorePreferences(storePreferences);

            StorePreference storePreference = storePreferenceManager.findByCDSP("Foo");
            System.out.println(storePreference.getValue());
            System.out.println(">> Done.");
        } catch (Exception ex){
            ex.printStackTrace();
        }
        context.close();

    }

    private static void printStorePreferences(List<StorePreference> storePreferences) {
        if (storePreferences != null) {
            for (StorePreference storePreference : storePreferences) {
                System.out.println(storePreference);
            }
        } else {
            System.out.println("Null StorePreferences returned.");
        }

    }
}
