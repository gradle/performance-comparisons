package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32681 {
    private final Productionnull_32681 production = new Productionnull_32681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}