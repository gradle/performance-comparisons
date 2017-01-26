package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37149 {
    private final Productionnull_37149 production = new Productionnull_37149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}