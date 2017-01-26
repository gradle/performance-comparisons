package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5491 {
    private final Productionnull_5491 production = new Productionnull_5491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}