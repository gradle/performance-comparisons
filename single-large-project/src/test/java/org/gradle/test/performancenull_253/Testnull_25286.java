package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25286 {
    private final Productionnull_25286 production = new Productionnull_25286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}