package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_18 {
    private final Productionnull_18 production = new Productionnull_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}