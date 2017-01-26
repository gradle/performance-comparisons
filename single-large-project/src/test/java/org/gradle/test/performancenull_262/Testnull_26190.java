package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26190 {
    private final Productionnull_26190 production = new Productionnull_26190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}