package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_194 {
    private final Production4_194 production = new Production4_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}