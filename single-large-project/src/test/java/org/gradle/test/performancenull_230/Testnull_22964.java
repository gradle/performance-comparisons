package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22964 {
    private final Productionnull_22964 production = new Productionnull_22964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}