package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49919 {
    private final Productionnull_49919 production = new Productionnull_49919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}