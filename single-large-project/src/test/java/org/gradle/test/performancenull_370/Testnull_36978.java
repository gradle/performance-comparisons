package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36978 {
    private final Productionnull_36978 production = new Productionnull_36978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}