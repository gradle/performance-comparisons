package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29983 {
    private final Productionnull_29983 production = new Productionnull_29983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}