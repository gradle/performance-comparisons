package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_150 {
    private final Productionnull_150 production = new Productionnull_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}