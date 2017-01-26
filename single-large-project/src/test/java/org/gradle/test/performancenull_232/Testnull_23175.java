package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23175 {
    private final Productionnull_23175 production = new Productionnull_23175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}