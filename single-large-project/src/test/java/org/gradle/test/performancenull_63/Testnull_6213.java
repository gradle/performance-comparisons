package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6213 {
    private final Productionnull_6213 production = new Productionnull_6213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}