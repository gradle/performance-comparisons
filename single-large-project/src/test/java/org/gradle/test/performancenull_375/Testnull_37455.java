package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37455 {
    private final Productionnull_37455 production = new Productionnull_37455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}