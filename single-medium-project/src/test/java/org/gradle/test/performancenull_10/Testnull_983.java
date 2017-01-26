package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_983 {
    private final Productionnull_983 production = new Productionnull_983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}