package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3153 {
    private final Productionnull_3153 production = new Productionnull_3153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}