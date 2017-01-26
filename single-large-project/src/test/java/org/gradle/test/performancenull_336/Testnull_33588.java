package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33588 {
    private final Productionnull_33588 production = new Productionnull_33588("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}