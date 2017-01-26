package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18467 {
    private final Productionnull_18467 production = new Productionnull_18467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}