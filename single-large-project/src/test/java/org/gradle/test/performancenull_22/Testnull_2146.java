package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2146 {
    private final Productionnull_2146 production = new Productionnull_2146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}