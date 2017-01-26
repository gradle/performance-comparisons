package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29971 {
    private final Productionnull_29971 production = new Productionnull_29971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}