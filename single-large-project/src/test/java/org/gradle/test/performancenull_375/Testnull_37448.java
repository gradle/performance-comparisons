package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37448 {
    private final Productionnull_37448 production = new Productionnull_37448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}