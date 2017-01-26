package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_123 {
    private final Production42_123 production = new Production42_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}