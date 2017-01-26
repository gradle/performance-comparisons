package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30040 {
    private final Productionnull_30040 production = new Productionnull_30040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}