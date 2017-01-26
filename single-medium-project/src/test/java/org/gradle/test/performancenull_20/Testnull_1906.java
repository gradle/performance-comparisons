package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1906 {
    private final Productionnull_1906 production = new Productionnull_1906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}