package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23910 {
    private final Productionnull_23910 production = new Productionnull_23910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}