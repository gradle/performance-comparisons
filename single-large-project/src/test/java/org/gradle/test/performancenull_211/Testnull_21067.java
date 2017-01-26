package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21067 {
    private final Productionnull_21067 production = new Productionnull_21067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}