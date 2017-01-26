package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24129 {
    private final Productionnull_24129 production = new Productionnull_24129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}