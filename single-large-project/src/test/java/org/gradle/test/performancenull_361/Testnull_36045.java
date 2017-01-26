package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36045 {
    private final Productionnull_36045 production = new Productionnull_36045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}