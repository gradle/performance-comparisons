package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30118 {
    private final Productionnull_30118 production = new Productionnull_30118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}