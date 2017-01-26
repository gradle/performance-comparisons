package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1169 {
    private final Productionnull_1169 production = new Productionnull_1169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}