package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22941 {
    private final Productionnull_22941 production = new Productionnull_22941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}