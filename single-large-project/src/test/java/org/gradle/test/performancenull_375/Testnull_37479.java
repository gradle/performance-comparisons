package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37479 {
    private final Productionnull_37479 production = new Productionnull_37479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}