package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15084 {
    private final Productionnull_15084 production = new Productionnull_15084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}