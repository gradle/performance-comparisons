package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37283 {
    private final Productionnull_37283 production = new Productionnull_37283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}