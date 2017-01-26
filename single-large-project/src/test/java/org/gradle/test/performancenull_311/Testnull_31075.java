package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31075 {
    private final Productionnull_31075 production = new Productionnull_31075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}