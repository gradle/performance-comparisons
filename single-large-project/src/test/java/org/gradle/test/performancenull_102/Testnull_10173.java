package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10173 {
    private final Productionnull_10173 production = new Productionnull_10173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}