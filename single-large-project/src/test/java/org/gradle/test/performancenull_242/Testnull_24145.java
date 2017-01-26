package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24145 {
    private final Productionnull_24145 production = new Productionnull_24145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}