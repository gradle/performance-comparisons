package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32481 {
    private final Productionnull_32481 production = new Productionnull_32481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}