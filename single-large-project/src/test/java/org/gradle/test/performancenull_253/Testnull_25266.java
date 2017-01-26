package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25266 {
    private final Productionnull_25266 production = new Productionnull_25266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}