package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10288 {
    private final Productionnull_10288 production = new Productionnull_10288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}