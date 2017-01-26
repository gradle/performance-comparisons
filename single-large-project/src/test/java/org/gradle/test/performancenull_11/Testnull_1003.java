package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1003 {
    private final Productionnull_1003 production = new Productionnull_1003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}