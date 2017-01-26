package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31502 {
    private final Productionnull_31502 production = new Productionnull_31502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}