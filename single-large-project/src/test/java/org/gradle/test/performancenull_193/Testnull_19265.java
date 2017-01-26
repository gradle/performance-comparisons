package org.gradle.test.performancenull_193;

import static org.junit.Assert.*;

public class Testnull_19265 {
    private final Productionnull_19265 production = new Productionnull_19265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}