package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25982 {
    private final Productionnull_25982 production = new Productionnull_25982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}