package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15006 {
    private final Productionnull_15006 production = new Productionnull_15006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}