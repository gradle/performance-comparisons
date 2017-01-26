package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36919 {
    private final Productionnull_36919 production = new Productionnull_36919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}