package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4428 {
    private final Productionnull_4428 production = new Productionnull_4428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}