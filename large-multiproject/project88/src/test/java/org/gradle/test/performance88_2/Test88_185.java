package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_185 {
    private final Production88_185 production = new Production88_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}