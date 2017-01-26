package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25220 {
    private final Productionnull_25220 production = new Productionnull_25220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}