package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_194 {
    private final Production79_194 production = new Production79_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}