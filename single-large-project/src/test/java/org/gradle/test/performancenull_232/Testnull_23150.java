package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23150 {
    private final Productionnull_23150 production = new Productionnull_23150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}