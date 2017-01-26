package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32961 {
    private final Productionnull_32961 production = new Productionnull_32961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}