package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40063 {
    private final Productionnull_40063 production = new Productionnull_40063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}