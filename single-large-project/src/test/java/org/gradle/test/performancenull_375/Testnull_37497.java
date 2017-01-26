package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37497 {
    private final Productionnull_37497 production = new Productionnull_37497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}