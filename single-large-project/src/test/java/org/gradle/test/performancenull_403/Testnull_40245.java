package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40245 {
    private final Productionnull_40245 production = new Productionnull_40245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}