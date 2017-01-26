package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36741 {
    private final Productionnull_36741 production = new Productionnull_36741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}