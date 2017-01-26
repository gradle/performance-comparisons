package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37966 {
    private final Productionnull_37966 production = new Productionnull_37966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}