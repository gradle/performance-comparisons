package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30276 {
    private final Productionnull_30276 production = new Productionnull_30276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}