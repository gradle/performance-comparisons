package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29946 {
    private final Productionnull_29946 production = new Productionnull_29946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}