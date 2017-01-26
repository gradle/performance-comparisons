package org.gradle.test.performancenull_105;

import static org.junit.Assert.*;

public class Testnull_10470 {
    private final Productionnull_10470 production = new Productionnull_10470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}