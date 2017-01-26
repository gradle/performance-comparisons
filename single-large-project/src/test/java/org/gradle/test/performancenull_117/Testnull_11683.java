package org.gradle.test.performancenull_117;

import static org.junit.Assert.*;

public class Testnull_11683 {
    private final Productionnull_11683 production = new Productionnull_11683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}