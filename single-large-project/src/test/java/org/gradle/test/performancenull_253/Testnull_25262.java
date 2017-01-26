package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25262 {
    private final Productionnull_25262 production = new Productionnull_25262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}