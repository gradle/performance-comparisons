package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2067 {
    private final Productionnull_2067 production = new Productionnull_2067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}