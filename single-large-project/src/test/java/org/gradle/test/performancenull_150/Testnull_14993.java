package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14993 {
    private final Productionnull_14993 production = new Productionnull_14993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}