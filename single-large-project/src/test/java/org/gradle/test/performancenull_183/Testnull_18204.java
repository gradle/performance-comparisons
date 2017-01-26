package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18204 {
    private final Productionnull_18204 production = new Productionnull_18204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}