package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13098 {
    private final Productionnull_13098 production = new Productionnull_13098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}