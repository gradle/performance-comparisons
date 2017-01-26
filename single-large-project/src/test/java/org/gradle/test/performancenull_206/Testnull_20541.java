package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20541 {
    private final Productionnull_20541 production = new Productionnull_20541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}