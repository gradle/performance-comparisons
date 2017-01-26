package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37441 {
    private final Productionnull_37441 production = new Productionnull_37441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}