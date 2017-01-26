package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10243 {
    private final Productionnull_10243 production = new Productionnull_10243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}