package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37468 {
    private final Productionnull_37468 production = new Productionnull_37468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}