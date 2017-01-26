package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7098 {
    private final Productionnull_7098 production = new Productionnull_7098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}