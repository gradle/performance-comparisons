package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30218 {
    private final Productionnull_30218 production = new Productionnull_30218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}