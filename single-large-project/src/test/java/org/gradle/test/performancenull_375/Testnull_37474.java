package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37474 {
    private final Productionnull_37474 production = new Productionnull_37474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}