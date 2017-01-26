package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36955 {
    private final Productionnull_36955 production = new Productionnull_36955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}