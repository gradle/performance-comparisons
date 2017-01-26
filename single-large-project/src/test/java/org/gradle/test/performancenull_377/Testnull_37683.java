package org.gradle.test.performancenull_377;

import static org.junit.Assert.*;

public class Testnull_37683 {
    private final Productionnull_37683 production = new Productionnull_37683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}