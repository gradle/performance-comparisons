package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_194 {
    private final Production42_194 production = new Production42_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}