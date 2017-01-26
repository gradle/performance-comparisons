package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_902 {
    private final Productionnull_902 production = new Productionnull_902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}