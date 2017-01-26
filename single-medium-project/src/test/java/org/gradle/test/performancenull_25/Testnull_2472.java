package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2472 {
    private final Productionnull_2472 production = new Productionnull_2472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}