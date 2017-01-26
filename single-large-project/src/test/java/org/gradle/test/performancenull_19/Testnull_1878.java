package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1878 {
    private final Productionnull_1878 production = new Productionnull_1878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}