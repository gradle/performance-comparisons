package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13906 {
    private final Productionnull_13906 production = new Productionnull_13906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}