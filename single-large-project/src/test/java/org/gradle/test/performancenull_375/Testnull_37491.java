package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37491 {
    private final Productionnull_37491 production = new Productionnull_37491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}