package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12418 {
    private final Productionnull_12418 production = new Productionnull_12418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}