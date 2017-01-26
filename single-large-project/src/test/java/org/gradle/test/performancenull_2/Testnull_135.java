package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_135 {
    private final Productionnull_135 production = new Productionnull_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}