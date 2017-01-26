package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30293 {
    private final Productionnull_30293 production = new Productionnull_30293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}