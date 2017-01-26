package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47255 {
    private final Productionnull_47255 production = new Productionnull_47255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}