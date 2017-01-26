package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4809 {
    private final Productionnull_4809 production = new Productionnull_4809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}