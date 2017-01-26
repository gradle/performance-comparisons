package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18805 {
    private final Productionnull_18805 production = new Productionnull_18805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}