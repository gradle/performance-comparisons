package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37424 {
    private final Productionnull_37424 production = new Productionnull_37424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}