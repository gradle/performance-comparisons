package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21779 {
    private final Productionnull_21779 production = new Productionnull_21779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}