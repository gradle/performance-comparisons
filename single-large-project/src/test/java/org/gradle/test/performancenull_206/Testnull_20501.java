package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20501 {
    private final Productionnull_20501 production = new Productionnull_20501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}