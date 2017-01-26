package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1091 {
    private final Productionnull_1091 production = new Productionnull_1091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}