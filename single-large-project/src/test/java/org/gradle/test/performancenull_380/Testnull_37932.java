package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37932 {
    private final Productionnull_37932 production = new Productionnull_37932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}