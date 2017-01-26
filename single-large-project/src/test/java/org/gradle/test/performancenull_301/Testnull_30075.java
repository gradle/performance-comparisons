package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30075 {
    private final Productionnull_30075 production = new Productionnull_30075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}