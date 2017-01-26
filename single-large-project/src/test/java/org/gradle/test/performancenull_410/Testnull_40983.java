package org.gradle.test.performancenull_410;

import static org.junit.Assert.*;

public class Testnull_40983 {
    private final Productionnull_40983 production = new Productionnull_40983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}