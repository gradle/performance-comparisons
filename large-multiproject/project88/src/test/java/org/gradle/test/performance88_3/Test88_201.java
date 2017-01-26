package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_201 {
    private final Production88_201 production = new Production88_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}