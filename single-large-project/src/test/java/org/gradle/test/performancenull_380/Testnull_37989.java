package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37989 {
    private final Productionnull_37989 production = new Productionnull_37989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}