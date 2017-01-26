package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49191 {
    private final Productionnull_49191 production = new Productionnull_49191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}