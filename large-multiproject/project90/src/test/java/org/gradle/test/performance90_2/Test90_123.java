package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_123 {
    private final Production90_123 production = new Production90_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}