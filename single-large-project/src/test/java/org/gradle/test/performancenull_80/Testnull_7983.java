package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7983 {
    private final Productionnull_7983 production = new Productionnull_7983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}