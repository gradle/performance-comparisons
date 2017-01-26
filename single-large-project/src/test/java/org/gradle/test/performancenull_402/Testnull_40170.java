package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40170 {
    private final Productionnull_40170 production = new Productionnull_40170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}