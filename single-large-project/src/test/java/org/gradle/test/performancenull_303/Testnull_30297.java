package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30297 {
    private final Productionnull_30297 production = new Productionnull_30297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}