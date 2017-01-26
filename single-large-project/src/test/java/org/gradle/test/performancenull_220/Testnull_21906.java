package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21906 {
    private final Productionnull_21906 production = new Productionnull_21906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}