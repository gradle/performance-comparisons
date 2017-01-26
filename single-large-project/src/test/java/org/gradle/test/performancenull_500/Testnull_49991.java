package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49991 {
    private final Productionnull_49991 production = new Productionnull_49991("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}