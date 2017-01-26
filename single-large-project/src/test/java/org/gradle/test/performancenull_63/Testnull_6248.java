package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6248 {
    private final Productionnull_6248 production = new Productionnull_6248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}