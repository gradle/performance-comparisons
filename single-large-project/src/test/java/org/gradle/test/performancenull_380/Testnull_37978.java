package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37978 {
    private final Productionnull_37978 production = new Productionnull_37978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}