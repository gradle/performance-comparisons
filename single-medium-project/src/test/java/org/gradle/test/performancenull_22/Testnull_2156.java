package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2156 {
    private final Productionnull_2156 production = new Productionnull_2156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}