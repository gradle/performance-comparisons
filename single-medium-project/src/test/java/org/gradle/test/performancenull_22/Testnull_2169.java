package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2169 {
    private final Productionnull_2169 production = new Productionnull_2169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}