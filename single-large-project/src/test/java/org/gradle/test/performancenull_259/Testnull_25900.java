package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25900 {
    private final Productionnull_25900 production = new Productionnull_25900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}