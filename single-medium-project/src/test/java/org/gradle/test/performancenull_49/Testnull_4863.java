package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4863 {
    private final Productionnull_4863 production = new Productionnull_4863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}