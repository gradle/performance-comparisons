package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38458 {
    private final Productionnull_38458 production = new Productionnull_38458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}