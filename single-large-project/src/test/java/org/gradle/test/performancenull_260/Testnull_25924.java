package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25924 {
    private final Productionnull_25924 production = new Productionnull_25924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}