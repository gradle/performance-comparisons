package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1566 {
    private final Productionnull_1566 production = new Productionnull_1566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}