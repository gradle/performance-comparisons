package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5029 {
    private final Productionnull_5029 production = new Productionnull_5029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}