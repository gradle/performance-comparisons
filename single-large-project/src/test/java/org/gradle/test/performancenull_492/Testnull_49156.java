package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49156 {
    private final Productionnull_49156 production = new Productionnull_49156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}