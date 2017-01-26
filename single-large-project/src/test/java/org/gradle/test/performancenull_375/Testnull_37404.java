package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37404 {
    private final Productionnull_37404 production = new Productionnull_37404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}