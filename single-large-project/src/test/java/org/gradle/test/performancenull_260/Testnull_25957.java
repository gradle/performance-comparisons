package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25957 {
    private final Productionnull_25957 production = new Productionnull_25957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}