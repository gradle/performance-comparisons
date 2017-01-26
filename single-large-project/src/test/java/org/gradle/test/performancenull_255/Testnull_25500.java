package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25500 {
    private final Productionnull_25500 production = new Productionnull_25500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}