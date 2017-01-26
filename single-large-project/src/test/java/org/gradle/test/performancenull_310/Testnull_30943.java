package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30943 {
    private final Productionnull_30943 production = new Productionnull_30943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}