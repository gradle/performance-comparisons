package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23806 {
    private final Productionnull_23806 production = new Productionnull_23806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}