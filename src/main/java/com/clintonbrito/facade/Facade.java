package com.clintonbrito.facade;

import com.clintonbrito.subsystem1.crm.CrmService;
import com.clintonbrito.subsystem2.cep.CepApi;

public class Facade {

    public void migrateCustomer(String name, String zipcode) {
        String city = CepApi.getInstance().getCity(zipcode);
        String state = CepApi.getInstance().getState(zipcode);

        CrmService.recordCustomer(name, zipcode, city, state);
    }

}
