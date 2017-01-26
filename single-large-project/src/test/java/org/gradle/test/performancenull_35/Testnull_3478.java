package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3478 {
    private final Productionnull_3478 production = new Productionnull_3478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}