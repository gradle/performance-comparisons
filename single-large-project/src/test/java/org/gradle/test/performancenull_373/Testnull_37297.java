package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37297 {
    private final Productionnull_37297 production = new Productionnull_37297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}