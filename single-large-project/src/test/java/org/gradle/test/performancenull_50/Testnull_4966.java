package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4966 {
    private final Productionnull_4966 production = new Productionnull_4966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}