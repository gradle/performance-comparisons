package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25860 {
    private final Productionnull_25860 production = new Productionnull_25860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}