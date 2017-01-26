package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42039 {
    private final Productionnull_42039 production = new Productionnull_42039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}