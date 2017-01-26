package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5207 {
    private final Productionnull_5207 production = new Productionnull_5207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}