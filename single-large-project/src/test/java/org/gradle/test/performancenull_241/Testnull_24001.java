package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24001 {
    private final Productionnull_24001 production = new Productionnull_24001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}