package org.gradle.test.performancenull_233;

import static org.junit.Assert.*;

public class Testnull_23205 {
    private final Productionnull_23205 production = new Productionnull_23205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}