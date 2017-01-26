package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30066 {
    private final Productionnull_30066 production = new Productionnull_30066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}