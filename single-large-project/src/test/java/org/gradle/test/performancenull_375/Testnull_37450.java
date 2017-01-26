package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37450 {
    private final Productionnull_37450 production = new Productionnull_37450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}