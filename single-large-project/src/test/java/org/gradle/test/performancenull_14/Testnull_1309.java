package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1309 {
    private final Productionnull_1309 production = new Productionnull_1309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}