package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25244 {
    private final Productionnull_25244 production = new Productionnull_25244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}