package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23199 {
    private final Productionnull_23199 production = new Productionnull_23199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}