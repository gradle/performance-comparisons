package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25922 {
    private final Productionnull_25922 production = new Productionnull_25922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}