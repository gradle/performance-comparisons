package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21685 {
    private final Productionnull_21685 production = new Productionnull_21685("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}