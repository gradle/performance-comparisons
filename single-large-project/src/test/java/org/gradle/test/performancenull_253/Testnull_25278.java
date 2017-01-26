package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25278 {
    private final Productionnull_25278 production = new Productionnull_25278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}