package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1001 {
    private final Productionnull_1001 production = new Productionnull_1001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}