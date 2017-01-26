package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12096 {
    private final Productionnull_12096 production = new Productionnull_12096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}