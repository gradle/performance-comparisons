package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15043 {
    private final Productionnull_15043 production = new Productionnull_15043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}