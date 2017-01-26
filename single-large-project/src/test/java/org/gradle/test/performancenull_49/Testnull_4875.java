package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4875 {
    private final Productionnull_4875 production = new Productionnull_4875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}