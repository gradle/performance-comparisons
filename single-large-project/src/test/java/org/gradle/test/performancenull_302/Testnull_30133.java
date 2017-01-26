package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30133 {
    private final Productionnull_30133 production = new Productionnull_30133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}