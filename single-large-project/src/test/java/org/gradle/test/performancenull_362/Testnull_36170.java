package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36170 {
    private final Productionnull_36170 production = new Productionnull_36170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}