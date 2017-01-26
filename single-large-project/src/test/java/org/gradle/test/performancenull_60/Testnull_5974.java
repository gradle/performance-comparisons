package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5974 {
    private final Productionnull_5974 production = new Productionnull_5974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}