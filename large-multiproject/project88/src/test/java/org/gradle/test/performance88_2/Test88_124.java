package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_124 {
    private final Production88_124 production = new Production88_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}