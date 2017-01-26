package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32745 {
    private final Productionnull_32745 production = new Productionnull_32745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}