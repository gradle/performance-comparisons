package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40177 {
    private final Productionnull_40177 production = new Productionnull_40177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}