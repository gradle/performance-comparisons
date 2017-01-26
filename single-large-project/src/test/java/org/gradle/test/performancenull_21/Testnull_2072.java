package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2072 {
    private final Productionnull_2072 production = new Productionnull_2072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}