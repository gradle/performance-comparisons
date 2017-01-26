package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33088 {
    private final Productionnull_33088 production = new Productionnull_33088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}