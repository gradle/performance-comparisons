package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1582 {
    private final Productionnull_1582 production = new Productionnull_1582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}