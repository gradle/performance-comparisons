package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10398 {
    private final Productionnull_10398 production = new Productionnull_10398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}