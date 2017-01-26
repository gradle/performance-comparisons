package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30286 {
    private final Productionnull_30286 production = new Productionnull_30286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}