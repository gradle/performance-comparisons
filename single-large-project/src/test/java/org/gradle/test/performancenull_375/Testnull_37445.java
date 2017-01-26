package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37445 {
    private final Productionnull_37445 production = new Productionnull_37445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}