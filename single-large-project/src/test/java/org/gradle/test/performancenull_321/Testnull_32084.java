package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32084 {
    private final Productionnull_32084 production = new Productionnull_32084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}