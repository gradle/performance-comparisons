package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22061 {
    private final Productionnull_22061 production = new Productionnull_22061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}