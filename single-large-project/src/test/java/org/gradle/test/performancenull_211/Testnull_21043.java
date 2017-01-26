package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21043 {
    private final Productionnull_21043 production = new Productionnull_21043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}