package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15001 {
    private final Productionnull_15001 production = new Productionnull_15001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}