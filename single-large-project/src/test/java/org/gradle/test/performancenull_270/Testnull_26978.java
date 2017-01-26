package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26978 {
    private final Productionnull_26978 production = new Productionnull_26978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}