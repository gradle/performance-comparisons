package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4101 {
    private final Productionnull_4101 production = new Productionnull_4101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}