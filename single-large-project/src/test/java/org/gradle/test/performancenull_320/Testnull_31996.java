package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31996 {
    private final Productionnull_31996 production = new Productionnull_31996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}