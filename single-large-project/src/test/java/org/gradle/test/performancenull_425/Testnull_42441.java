package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42441 {
    private final Productionnull_42441 production = new Productionnull_42441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}