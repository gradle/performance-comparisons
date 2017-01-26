package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_194 {
    private final Production22_194 production = new Production22_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}