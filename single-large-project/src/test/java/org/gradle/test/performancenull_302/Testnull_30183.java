package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30183 {
    private final Productionnull_30183 production = new Productionnull_30183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}