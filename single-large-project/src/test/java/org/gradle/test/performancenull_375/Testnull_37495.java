package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37495 {
    private final Productionnull_37495 production = new Productionnull_37495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}