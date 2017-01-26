package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10206 {
    private final Productionnull_10206 production = new Productionnull_10206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}