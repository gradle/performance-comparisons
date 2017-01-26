package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28001 {
    private final Productionnull_28001 production = new Productionnull_28001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}