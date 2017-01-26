package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_95 {
    private final Productionnull_95 production = new Productionnull_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}