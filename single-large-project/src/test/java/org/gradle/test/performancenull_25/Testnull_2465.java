package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2465 {
    private final Productionnull_2465 production = new Productionnull_2465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}