package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32700 {
    private final Productionnull_32700 production = new Productionnull_32700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}