package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38484 {
    private final Productionnull_38484 production = new Productionnull_38484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}