package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30105 {
    private final Productionnull_30105 production = new Productionnull_30105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}