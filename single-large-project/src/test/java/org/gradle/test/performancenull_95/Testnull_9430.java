package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9430 {
    private final Productionnull_9430 production = new Productionnull_9430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}