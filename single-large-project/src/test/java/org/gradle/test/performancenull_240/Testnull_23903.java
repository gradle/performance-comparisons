package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23903 {
    private final Productionnull_23903 production = new Productionnull_23903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}