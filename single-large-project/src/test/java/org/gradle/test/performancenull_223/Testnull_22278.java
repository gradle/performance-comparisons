package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22278 {
    private final Productionnull_22278 production = new Productionnull_22278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}