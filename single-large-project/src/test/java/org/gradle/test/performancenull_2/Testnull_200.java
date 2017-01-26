package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_200 {
    private final Productionnull_200 production = new Productionnull_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}