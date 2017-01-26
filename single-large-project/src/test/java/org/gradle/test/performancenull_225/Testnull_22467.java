package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22467 {
    private final Productionnull_22467 production = new Productionnull_22467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}