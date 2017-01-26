package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25972 {
    private final Productionnull_25972 production = new Productionnull_25972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}