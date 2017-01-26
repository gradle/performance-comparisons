package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11910 {
    private final Productionnull_11910 production = new Productionnull_11910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}