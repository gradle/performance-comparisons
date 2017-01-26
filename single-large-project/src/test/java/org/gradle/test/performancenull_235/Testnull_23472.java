package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23472 {
    private final Productionnull_23472 production = new Productionnull_23472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}