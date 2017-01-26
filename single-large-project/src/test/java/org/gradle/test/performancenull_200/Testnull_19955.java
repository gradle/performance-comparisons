package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19955 {
    private final Productionnull_19955 production = new Productionnull_19955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}