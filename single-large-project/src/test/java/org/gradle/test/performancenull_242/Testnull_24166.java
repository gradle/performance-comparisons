package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24166 {
    private final Productionnull_24166 production = new Productionnull_24166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}