package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5149 {
    private final Productionnull_5149 production = new Productionnull_5149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}