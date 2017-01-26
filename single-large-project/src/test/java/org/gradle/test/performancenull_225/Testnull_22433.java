package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22433 {
    private final Productionnull_22433 production = new Productionnull_22433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}