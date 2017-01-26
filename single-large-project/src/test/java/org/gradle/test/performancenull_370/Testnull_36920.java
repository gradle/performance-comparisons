package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36920 {
    private final Productionnull_36920 production = new Productionnull_36920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}