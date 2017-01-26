package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32156 {
    private final Productionnull_32156 production = new Productionnull_32156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}