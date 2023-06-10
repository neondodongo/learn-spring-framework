package com.neondodongo.learnspringframework.service;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    public int[] retrieveData() {
        return new int[]{6, 7, 8, 9, 10};
    }
}
