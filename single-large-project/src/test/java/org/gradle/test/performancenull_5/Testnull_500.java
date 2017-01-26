package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_500 {
    private final Productionnull_500 production = new Productionnull_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}