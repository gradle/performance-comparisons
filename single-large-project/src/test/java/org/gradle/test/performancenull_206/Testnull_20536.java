package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20536 {
    private final Productionnull_20536 production = new Productionnull_20536("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}