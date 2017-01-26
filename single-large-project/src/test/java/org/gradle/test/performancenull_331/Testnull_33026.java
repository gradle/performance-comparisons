package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33026 {
    private final Productionnull_33026 production = new Productionnull_33026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}