package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37241 {
    private final Productionnull_37241 production = new Productionnull_37241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}