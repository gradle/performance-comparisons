package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37418 {
    private final Productionnull_37418 production = new Productionnull_37418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}