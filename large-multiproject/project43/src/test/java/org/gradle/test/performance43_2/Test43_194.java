package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_194 {
    private final Production43_194 production = new Production43_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}