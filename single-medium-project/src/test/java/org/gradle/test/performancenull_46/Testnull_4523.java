package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4523 {
    private final Productionnull_4523 production = new Productionnull_4523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}