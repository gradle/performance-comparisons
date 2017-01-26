package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1243 {
    private final Productionnull_1243 production = new Productionnull_1243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}