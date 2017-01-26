package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35042 {
    private final Productionnull_35042 production = new Productionnull_35042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}