package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23125 {
    private final Productionnull_23125 production = new Productionnull_23125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}