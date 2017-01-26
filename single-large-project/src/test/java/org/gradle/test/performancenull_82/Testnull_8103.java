package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8103 {
    private final Productionnull_8103 production = new Productionnull_8103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}