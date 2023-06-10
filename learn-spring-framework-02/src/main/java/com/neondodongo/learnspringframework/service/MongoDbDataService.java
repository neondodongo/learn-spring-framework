package com.neondodongo.learnspringframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDbDataService implements DataService {
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 1000, 4};
    }
}
