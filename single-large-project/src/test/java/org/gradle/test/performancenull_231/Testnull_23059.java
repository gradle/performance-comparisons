package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23059 {
    private final Productionnull_23059 production = new Productionnull_23059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}