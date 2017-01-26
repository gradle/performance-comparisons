package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33921 {
    private final Productionnull_33921 production = new Productionnull_33921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}