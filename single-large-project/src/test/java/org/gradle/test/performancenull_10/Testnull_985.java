package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_985 {
    private final Productionnull_985 production = new Productionnull_985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}