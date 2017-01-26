package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49160 {
    private final Productionnull_49160 production = new Productionnull_49160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}