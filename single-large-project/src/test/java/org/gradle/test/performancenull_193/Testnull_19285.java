package org.gradle.test.performancenull_193;

import static org.junit.Assert.*;

public class Testnull_19285 {
    private final Productionnull_19285 production = new Productionnull_19285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}