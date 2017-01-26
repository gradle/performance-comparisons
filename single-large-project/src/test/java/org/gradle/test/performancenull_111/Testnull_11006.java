package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11006 {
    private final Productionnull_11006 production = new Productionnull_11006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}