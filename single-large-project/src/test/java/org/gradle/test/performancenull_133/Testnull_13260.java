package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13260 {
    private final Productionnull_13260 production = new Productionnull_13260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}