package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12402 {
    private final Productionnull_12402 production = new Productionnull_12402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}