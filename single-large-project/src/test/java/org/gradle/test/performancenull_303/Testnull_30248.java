package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30248 {
    private final Productionnull_30248 production = new Productionnull_30248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}