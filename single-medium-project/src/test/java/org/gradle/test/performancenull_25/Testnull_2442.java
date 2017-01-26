package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2442 {
    private final Productionnull_2442 production = new Productionnull_2442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}