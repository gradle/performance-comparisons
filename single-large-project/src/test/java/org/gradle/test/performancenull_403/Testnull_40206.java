package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40206 {
    private final Productionnull_40206 production = new Productionnull_40206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}