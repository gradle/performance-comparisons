package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30058 {
    private final Productionnull_30058 production = new Productionnull_30058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}