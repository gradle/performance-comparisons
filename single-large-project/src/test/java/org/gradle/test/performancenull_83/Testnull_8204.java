package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8204 {
    private final Productionnull_8204 production = new Productionnull_8204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}