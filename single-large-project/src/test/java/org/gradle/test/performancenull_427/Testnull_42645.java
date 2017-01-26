package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42645 {
    private final Productionnull_42645 production = new Productionnull_42645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}