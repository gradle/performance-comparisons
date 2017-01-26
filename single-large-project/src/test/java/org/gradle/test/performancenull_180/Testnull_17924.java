package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17924 {
    private final Productionnull_17924 production = new Productionnull_17924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}