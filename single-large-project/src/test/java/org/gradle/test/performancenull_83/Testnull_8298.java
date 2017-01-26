package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8298 {
    private final Productionnull_8298 production = new Productionnull_8298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}