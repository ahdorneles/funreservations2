package org.academiadecodigo.bootcamp.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codecadet on 14/03/2017.
 */
public final class ServiceRegistry implements Service {

    private Map<String, Service> serviceMap = new HashMap<>();
    private static ServiceRegistry instance = null;


    private ServiceRegistry() {

    }

    public static synchronized ServiceRegistry getInstance() {

        if (instance == null) {
            instance = new ServiceRegistry();
        }
        return instance;
    }

    //  public void add(UserService service) {
    //    if (!serviceMap.containsKey(service.getKey())) {
    //      serviceMap.put(service.getKey(), service);

    //  }
    // }

    public Service getService(String key) {
        return serviceMap.get(key);

    }

    public void removeService(String key) {
        serviceMap.remove(key);

    }


    @Override
    public String getKey() {
        return ServiceRegistry.getInstance().getKey();
    }
}


