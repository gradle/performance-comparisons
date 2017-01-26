package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4702 {
    private final Productionnull_4702 production = new Productionnull_4702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}