package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21579 {
    private final Productionnull_21579 production = new Productionnull_21579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}