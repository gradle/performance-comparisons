package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25987 {
    private final Productionnull_25987 production = new Productionnull_25987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}