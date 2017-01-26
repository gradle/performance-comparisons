package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37471 {
    private final Productionnull_37471 production = new Productionnull_37471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}