package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37488 {
    private final Productionnull_37488 production = new Productionnull_37488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}