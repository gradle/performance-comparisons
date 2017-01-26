package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12466 {
    private final Productionnull_12466 production = new Productionnull_12466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}