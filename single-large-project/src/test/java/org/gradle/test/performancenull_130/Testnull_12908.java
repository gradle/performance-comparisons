package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12908 {
    private final Productionnull_12908 production = new Productionnull_12908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}