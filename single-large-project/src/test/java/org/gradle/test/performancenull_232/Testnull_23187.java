package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23187 {
    private final Productionnull_23187 production = new Productionnull_23187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}