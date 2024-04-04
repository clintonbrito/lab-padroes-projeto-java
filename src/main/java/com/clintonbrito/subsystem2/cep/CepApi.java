package com.clintonbrito.subsystem2.cep;

/**
 * Singleton "Lazy Holder".
 *  @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */

public class CepApi {

    private static class InstanceHolder {
        public static CepApi instance = new CepApi();
    }

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return InstanceHolder.instance;
    }

    public String getCity(String zipcode) {
        return "São Paulo";
    }

    public String getState(String zipcode) {
        return "SP";
    }

}
