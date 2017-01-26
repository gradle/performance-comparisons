package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_194 {
    private final Production14_194 production = new Production14_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}