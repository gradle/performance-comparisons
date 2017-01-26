package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20358 {
    private final Productionnull_20358 production = new Productionnull_20358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}