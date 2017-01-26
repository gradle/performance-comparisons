package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2190 {
    private final Productionnull_2190 production = new Productionnull_2190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}