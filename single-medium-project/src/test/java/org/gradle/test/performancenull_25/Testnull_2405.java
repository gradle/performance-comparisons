package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2405 {
    private final Productionnull_2405 production = new Productionnull_2405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}