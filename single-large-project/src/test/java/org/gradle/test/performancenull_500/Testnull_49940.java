package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49940 {
    private final Productionnull_49940 production = new Productionnull_49940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}