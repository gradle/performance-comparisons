package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19180 {
    private final Productionnull_19180 production = new Productionnull_19180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}