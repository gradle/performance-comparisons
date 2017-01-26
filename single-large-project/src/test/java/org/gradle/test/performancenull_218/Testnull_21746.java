package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21746 {
    private final Productionnull_21746 production = new Productionnull_21746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}