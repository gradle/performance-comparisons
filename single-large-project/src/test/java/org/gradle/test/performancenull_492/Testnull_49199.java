package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49199 {
    private final Productionnull_49199 production = new Productionnull_49199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}