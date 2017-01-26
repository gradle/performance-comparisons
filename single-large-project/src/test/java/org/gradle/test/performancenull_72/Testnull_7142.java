package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7142 {
    private final Productionnull_7142 production = new Productionnull_7142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}