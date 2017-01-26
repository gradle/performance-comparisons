package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36763 {
    private final Productionnull_36763 production = new Productionnull_36763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}