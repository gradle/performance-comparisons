package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49926 {
    private final Productionnull_49926 production = new Productionnull_49926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}