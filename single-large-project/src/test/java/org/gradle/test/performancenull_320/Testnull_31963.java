package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31963 {
    private final Productionnull_31963 production = new Productionnull_31963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}