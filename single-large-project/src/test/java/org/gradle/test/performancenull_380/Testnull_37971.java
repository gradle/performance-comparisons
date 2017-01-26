package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37971 {
    private final Productionnull_37971 production = new Productionnull_37971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}