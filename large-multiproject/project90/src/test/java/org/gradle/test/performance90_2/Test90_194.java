package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_194 {
    private final Production90_194 production = new Production90_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}