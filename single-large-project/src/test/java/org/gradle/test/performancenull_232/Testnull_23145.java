package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23145 {
    private final Productionnull_23145 production = new Productionnull_23145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}