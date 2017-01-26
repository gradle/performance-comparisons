package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1201 {
    private final Productionnull_1201 production = new Productionnull_1201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}