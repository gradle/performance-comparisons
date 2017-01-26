package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15041 {
    private final Productionnull_15041 production = new Productionnull_15041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}