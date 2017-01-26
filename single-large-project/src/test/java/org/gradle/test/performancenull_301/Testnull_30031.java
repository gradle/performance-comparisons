package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30031 {
    private final Productionnull_30031 production = new Productionnull_30031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}