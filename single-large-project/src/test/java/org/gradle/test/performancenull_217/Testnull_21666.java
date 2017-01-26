package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21666 {
    private final Productionnull_21666 production = new Productionnull_21666("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}