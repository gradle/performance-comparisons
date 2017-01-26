package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30184 {
    private final Productionnull_30184 production = new Productionnull_30184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}