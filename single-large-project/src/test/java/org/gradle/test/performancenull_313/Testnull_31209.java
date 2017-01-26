package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31209 {
    private final Productionnull_31209 production = new Productionnull_31209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}