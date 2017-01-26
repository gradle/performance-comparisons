package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20387 {
    private final Productionnull_20387 production = new Productionnull_20387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}