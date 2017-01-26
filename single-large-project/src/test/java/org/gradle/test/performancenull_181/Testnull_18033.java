package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18033 {
    private final Productionnull_18033 production = new Productionnull_18033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}