package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25558 {
    private final Productionnull_25558 production = new Productionnull_25558("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}