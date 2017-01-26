package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7468 {
    private final Productionnull_7468 production = new Productionnull_7468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}