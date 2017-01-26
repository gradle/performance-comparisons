package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30086 {
    private final Productionnull_30086 production = new Productionnull_30086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}