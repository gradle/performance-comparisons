package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4068 {
    private final Productionnull_4068 production = new Productionnull_4068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}