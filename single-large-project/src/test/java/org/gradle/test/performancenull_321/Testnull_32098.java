package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32098 {
    private final Productionnull_32098 production = new Productionnull_32098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}