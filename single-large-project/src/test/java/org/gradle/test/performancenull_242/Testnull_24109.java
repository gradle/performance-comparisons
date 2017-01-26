package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24109 {
    private final Productionnull_24109 production = new Productionnull_24109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}