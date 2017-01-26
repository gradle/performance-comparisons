package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2486 {
    private final Productionnull_2486 production = new Productionnull_2486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}