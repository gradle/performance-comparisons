package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12781 {
    private final Productionnull_12781 production = new Productionnull_12781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}