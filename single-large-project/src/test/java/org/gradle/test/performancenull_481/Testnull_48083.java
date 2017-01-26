package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48083 {
    private final Productionnull_48083 production = new Productionnull_48083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}