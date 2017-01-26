package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_194 {
    private final Production16_194 production = new Production16_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}