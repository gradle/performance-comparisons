package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25933 {
    private final Productionnull_25933 production = new Productionnull_25933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}