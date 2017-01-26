package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47381 {
    private final Productionnull_47381 production = new Productionnull_47381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}