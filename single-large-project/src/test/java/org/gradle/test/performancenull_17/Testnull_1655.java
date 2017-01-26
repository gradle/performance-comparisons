package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1655 {
    private final Productionnull_1655 production = new Productionnull_1655("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}