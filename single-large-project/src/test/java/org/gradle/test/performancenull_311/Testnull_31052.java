package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31052 {
    private final Productionnull_31052 production = new Productionnull_31052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}