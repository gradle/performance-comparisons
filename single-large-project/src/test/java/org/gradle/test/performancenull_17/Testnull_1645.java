package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1645 {
    private final Productionnull_1645 production = new Productionnull_1645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}