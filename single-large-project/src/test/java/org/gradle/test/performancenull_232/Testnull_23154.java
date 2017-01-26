package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23154 {
    private final Productionnull_23154 production = new Productionnull_23154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}