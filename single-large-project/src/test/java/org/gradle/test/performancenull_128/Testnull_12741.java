package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12741 {
    private final Productionnull_12741 production = new Productionnull_12741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}