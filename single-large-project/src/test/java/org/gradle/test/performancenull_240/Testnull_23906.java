package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23906 {
    private final Productionnull_23906 production = new Productionnull_23906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}