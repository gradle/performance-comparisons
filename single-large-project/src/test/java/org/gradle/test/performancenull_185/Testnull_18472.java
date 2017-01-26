package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18472 {
    private final Productionnull_18472 production = new Productionnull_18472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}