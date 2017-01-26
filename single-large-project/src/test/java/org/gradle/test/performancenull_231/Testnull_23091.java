package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23091 {
    private final Productionnull_23091 production = new Productionnull_23091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}