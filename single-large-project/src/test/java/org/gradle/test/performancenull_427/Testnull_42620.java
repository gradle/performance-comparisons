package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42620 {
    private final Productionnull_42620 production = new Productionnull_42620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}