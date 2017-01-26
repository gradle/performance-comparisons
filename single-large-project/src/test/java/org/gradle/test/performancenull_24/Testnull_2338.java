package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2338 {
    private final Productionnull_2338 production = new Productionnull_2338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}