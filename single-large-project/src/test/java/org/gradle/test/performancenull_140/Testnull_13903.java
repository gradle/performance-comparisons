package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13903 {
    private final Productionnull_13903 production = new Productionnull_13903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}