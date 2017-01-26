package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1538 {
    private final Productionnull_1538 production = new Productionnull_1538("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}