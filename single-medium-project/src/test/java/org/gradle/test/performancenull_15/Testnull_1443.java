package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1443 {
    private final Productionnull_1443 production = new Productionnull_1443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}