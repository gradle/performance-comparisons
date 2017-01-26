package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22961 {
    private final Productionnull_22961 production = new Productionnull_22961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}