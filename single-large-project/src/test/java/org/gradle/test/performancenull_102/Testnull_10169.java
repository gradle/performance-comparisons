package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10169 {
    private final Productionnull_10169 production = new Productionnull_10169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}