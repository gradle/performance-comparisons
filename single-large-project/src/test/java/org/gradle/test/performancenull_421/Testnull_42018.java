package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42018 {
    private final Productionnull_42018 production = new Productionnull_42018("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}