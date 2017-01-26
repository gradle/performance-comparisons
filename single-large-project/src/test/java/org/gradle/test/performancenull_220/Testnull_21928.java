package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21928 {
    private final Productionnull_21928 production = new Productionnull_21928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}