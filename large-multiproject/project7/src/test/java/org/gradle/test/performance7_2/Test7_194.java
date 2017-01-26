package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_194 {
    private final Production7_194 production = new Production7_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}