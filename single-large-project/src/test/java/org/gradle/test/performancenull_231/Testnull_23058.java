package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23058 {
    private final Productionnull_23058 production = new Productionnull_23058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}