package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49161 {
    private final Productionnull_49161 production = new Productionnull_49161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}