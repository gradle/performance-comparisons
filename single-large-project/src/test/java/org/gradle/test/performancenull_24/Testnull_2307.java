package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2307 {
    private final Productionnull_2307 production = new Productionnull_2307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}