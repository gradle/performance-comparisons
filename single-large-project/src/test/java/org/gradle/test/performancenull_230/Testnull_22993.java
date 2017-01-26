package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22993 {
    private final Productionnull_22993 production = new Productionnull_22993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}