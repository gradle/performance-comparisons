package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37206 {
    private final Productionnull_37206 production = new Productionnull_37206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}