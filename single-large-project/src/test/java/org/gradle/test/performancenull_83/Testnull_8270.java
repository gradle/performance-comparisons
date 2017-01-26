package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8270 {
    private final Productionnull_8270 production = new Productionnull_8270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}