package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4903 {
    private final Productionnull_4903 production = new Productionnull_4903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}