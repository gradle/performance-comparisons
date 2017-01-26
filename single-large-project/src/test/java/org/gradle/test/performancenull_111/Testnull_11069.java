package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11069 {
    private final Productionnull_11069 production = new Productionnull_11069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}