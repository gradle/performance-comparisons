package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21856 {
    private final Productionnull_21856 production = new Productionnull_21856("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}