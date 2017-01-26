package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25478 {
    private final Productionnull_25478 production = new Productionnull_25478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}