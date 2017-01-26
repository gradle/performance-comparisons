package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37256 {
    private final Productionnull_37256 production = new Productionnull_37256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}