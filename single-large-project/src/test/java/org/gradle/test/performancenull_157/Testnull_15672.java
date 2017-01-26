package org.gradle.test.performancenull_157;

import static org.junit.Assert.*;

public class Testnull_15672 {
    private final Productionnull_15672 production = new Productionnull_15672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}