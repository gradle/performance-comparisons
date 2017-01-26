package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37490 {
    private final Productionnull_37490 production = new Productionnull_37490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}