package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10348 {
    private final Productionnull_10348 production = new Productionnull_10348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}