package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25206 {
    private final Productionnull_25206 production = new Productionnull_25206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}