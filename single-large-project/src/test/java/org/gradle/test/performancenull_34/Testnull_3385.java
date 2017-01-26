package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3385 {
    private final Productionnull_3385 production = new Productionnull_3385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}