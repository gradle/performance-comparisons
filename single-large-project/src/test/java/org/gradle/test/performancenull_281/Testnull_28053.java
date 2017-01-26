package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28053 {
    private final Productionnull_28053 production = new Productionnull_28053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}