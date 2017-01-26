package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21092 {
    private final Productionnull_21092 production = new Productionnull_21092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}