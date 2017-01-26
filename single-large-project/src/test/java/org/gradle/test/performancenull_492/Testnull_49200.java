package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49200 {
    private final Productionnull_49200 production = new Productionnull_49200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}