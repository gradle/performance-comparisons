package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_199 {
    private final Productionnull_199 production = new Productionnull_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}