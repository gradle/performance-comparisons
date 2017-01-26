package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22905 {
    private final Productionnull_22905 production = new Productionnull_22905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}