package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3749 {
    private final Productionnull_3749 production = new Productionnull_3749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}