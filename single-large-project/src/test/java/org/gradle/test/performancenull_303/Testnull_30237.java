package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30237 {
    private final Productionnull_30237 production = new Productionnull_30237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}