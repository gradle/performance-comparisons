package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37498 {
    private final Productionnull_37498 production = new Productionnull_37498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}