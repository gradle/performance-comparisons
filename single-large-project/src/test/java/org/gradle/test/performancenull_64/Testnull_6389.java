package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6389 {
    private final Productionnull_6389 production = new Productionnull_6389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}