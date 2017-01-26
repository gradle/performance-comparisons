package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8201 {
    private final Productionnull_8201 production = new Productionnull_8201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}