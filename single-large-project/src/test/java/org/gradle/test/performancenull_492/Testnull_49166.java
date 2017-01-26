package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49166 {
    private final Productionnull_49166 production = new Productionnull_49166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}