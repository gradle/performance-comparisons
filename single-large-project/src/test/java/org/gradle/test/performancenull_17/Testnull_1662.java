package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1662 {
    private final Productionnull_1662 production = new Productionnull_1662("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}