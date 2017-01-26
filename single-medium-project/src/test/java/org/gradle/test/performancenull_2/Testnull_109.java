package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_109 {
    private final Productionnull_109 production = new Productionnull_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}