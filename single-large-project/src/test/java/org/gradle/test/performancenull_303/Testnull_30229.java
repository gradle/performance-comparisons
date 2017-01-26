package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30229 {
    private final Productionnull_30229 production = new Productionnull_30229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}