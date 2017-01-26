package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1749 {
    private final Productionnull_1749 production = new Productionnull_1749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}