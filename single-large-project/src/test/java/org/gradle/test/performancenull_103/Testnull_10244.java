package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10244 {
    private final Productionnull_10244 production = new Productionnull_10244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}