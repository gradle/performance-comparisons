package org.gradle.test.performancenull_264;

import static org.junit.Assert.*;

public class Testnull_26373 {
    private final Productionnull_26373 production = new Productionnull_26373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}