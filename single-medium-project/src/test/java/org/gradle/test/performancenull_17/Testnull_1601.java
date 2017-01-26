package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1601 {
    private final Productionnull_1601 production = new Productionnull_1601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}