package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27162 {
    private final Productionnull_27162 production = new Productionnull_27162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}