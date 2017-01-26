package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21933 {
    private final Productionnull_21933 production = new Productionnull_21933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}