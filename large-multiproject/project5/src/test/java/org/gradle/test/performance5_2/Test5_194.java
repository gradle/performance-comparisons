package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_194 {
    private final Production5_194 production = new Production5_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}