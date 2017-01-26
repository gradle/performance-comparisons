package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36913 {
    private final Productionnull_36913 production = new Productionnull_36913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}