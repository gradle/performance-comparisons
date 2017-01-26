package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49105 {
    private final Productionnull_49105 production = new Productionnull_49105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}