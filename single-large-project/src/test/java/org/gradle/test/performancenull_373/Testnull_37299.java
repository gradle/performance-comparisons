package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37299 {
    private final Productionnull_37299 production = new Productionnull_37299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}