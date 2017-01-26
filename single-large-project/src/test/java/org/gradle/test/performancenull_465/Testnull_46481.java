package org.gradle.test.performancenull_465;

import static org.junit.Assert.*;

public class Testnull_46481 {
    private final Productionnull_46481 production = new Productionnull_46481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}