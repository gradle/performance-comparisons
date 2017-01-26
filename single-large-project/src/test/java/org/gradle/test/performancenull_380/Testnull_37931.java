package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37931 {
    private final Productionnull_37931 production = new Productionnull_37931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}