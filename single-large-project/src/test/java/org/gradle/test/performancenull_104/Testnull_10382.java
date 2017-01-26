package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10382 {
    private final Productionnull_10382 production = new Productionnull_10382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}