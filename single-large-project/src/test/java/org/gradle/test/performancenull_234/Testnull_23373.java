package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23373 {
    private final Productionnull_23373 production = new Productionnull_23373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}