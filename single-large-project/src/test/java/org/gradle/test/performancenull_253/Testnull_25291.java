package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25291 {
    private final Productionnull_25291 production = new Productionnull_25291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}