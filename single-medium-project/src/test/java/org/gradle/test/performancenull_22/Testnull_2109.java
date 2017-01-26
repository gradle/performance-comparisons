package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2109 {
    private final Productionnull_2109 production = new Productionnull_2109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}