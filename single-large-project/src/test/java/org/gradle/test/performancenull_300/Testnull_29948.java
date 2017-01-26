package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29948 {
    private final Productionnull_29948 production = new Productionnull_29948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}