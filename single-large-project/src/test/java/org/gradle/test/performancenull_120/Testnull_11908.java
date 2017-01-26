package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11908 {
    private final Productionnull_11908 production = new Productionnull_11908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}