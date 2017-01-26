package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36948 {
    private final Productionnull_36948 production = new Productionnull_36948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}