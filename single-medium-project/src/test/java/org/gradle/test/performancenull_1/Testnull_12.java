package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_12 {
    private final Productionnull_12 production = new Productionnull_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}