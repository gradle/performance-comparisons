package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37290 {
    private final Productionnull_37290 production = new Productionnull_37290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}