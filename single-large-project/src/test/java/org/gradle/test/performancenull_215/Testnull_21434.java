package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21434 {
    private final Productionnull_21434 production = new Productionnull_21434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}