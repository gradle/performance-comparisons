package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18683 {
    private final Productionnull_18683 production = new Productionnull_18683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}