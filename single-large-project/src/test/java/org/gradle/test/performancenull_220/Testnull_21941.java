package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21941 {
    private final Productionnull_21941 production = new Productionnull_21941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}