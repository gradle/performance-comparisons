package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37250 {
    private final Productionnull_37250 production = new Productionnull_37250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}