package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37905 {
    private final Productionnull_37905 production = new Productionnull_37905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}