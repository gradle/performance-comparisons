package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41380 {
    private final Productionnull_41380 production = new Productionnull_41380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}