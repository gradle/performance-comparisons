package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2154 {
    private final Productionnull_2154 production = new Productionnull_2154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}