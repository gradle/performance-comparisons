package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21964 {
    private final Productionnull_21964 production = new Productionnull_21964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}