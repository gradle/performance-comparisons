package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1633 {
    private final Productionnull_1633 production = new Productionnull_1633("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}