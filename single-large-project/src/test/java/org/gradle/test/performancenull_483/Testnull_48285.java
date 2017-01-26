package org.gradle.test.performancenull_483;

import static org.junit.Assert.*;

public class Testnull_48285 {
    private final Productionnull_48285 production = new Productionnull_48285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}