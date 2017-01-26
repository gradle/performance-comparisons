package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2085 {
    private final Productionnull_2085 production = new Productionnull_2085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}