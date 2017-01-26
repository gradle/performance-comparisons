package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37941 {
    private final Productionnull_37941 production = new Productionnull_37941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}