package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37207 {
    private final Productionnull_37207 production = new Productionnull_37207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}