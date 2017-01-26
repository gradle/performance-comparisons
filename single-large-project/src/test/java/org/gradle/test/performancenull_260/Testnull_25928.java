package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25928 {
    private final Productionnull_25928 production = new Productionnull_25928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}