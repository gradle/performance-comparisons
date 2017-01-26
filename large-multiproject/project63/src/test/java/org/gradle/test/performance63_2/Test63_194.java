package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_194 {
    private final Production63_194 production = new Production63_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}