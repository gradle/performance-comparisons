package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_123 {
    private final Production62_123 production = new Production62_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}