package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37285 {
    private final Productionnull_37285 production = new Productionnull_37285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}