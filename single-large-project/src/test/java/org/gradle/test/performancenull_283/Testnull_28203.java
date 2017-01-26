package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28203 {
    private final Productionnull_28203 production = new Productionnull_28203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}