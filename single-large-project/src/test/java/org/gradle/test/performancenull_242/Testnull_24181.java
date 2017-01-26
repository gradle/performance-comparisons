package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24181 {
    private final Productionnull_24181 production = new Productionnull_24181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}