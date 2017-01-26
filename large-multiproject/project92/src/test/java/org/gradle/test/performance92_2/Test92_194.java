package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_194 {
    private final Production92_194 production = new Production92_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}