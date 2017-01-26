package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36951 {
    private final Productionnull_36951 production = new Productionnull_36951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}