package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5930 {
    private final Productionnull_5930 production = new Productionnull_5930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}