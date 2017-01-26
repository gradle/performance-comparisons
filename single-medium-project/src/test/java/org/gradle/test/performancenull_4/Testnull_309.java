package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_309 {
    private final Productionnull_309 production = new Productionnull_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}