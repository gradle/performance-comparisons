package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_194 {
    private final Production37_194 production = new Production37_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}