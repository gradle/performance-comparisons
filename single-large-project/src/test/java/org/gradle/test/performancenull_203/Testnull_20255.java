package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20255 {
    private final Productionnull_20255 production = new Productionnull_20255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}