package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22928 {
    private final Productionnull_22928 production = new Productionnull_22928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}