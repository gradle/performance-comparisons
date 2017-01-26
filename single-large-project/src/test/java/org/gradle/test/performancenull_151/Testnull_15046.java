package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15046 {
    private final Productionnull_15046 production = new Productionnull_15046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}