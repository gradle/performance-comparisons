package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32962 {
    private final Productionnull_32962 production = new Productionnull_32962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}