package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25271 {
    private final Productionnull_25271 production = new Productionnull_25271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}