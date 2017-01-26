package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24136 {
    private final Productionnull_24136 production = new Productionnull_24136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}