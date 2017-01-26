package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40179 {
    private final Productionnull_40179 production = new Productionnull_40179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}