package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32998 {
    private final Productionnull_32998 production = new Productionnull_32998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}