package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_123 {
    private final Production79_123 production = new Production79_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}